import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Danhdauchucai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> end = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            end.add(s.charAt(i));
        }
        System.out.println(end.size());
    }
}