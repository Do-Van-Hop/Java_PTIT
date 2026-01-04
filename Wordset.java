import java.util.*;

public class Wordset {

    static class WordSet {
        TreeSet<String> words;

        WordSet(String s) {
            words = new TreeSet<>();
            if (s != null && !s.trim().isEmpty()) {
                Collections.addAll(words, s.toLowerCase().trim().split("\\s+"));
            }
        }

        WordSet() {
            words = new TreeSet<>();
        }

        WordSet union(WordSet other) {
            WordSet result = new WordSet();
            result.words.addAll(this.words);
            result.words.addAll(other.words);
            return result;
        }

        WordSet intersection(WordSet other) {
            WordSet result = new WordSet();
            result.words.addAll(this.words);
            result.words.retainAll(other.words);
            return result;
        }

        @Override
        public String toString() {
            return String.join(" ", words);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}