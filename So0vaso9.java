import java.util.*;

class Pair {
    String s;
    int r;

    Pair(String s, int r) {
        this.s = s;
        this.r = r;
    }
}

public class So0vaso9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (N == 0) {
                System.out.println("0");
                continue;
            }
            String[] best = new String[N];
            PriorityQueue<Pair> queue = new PriorityQueue<>((a, b) -> {
                if (a.s.length() != b.s.length()) {
                    return a.s.length() - b.s.length();
                }
                return a.s.compareTo(b.s);
            });

            String start = "9";
            int r0 = 9 % N;
            best[r0] = start;
            queue.add(new Pair(start, r0));

            while (!queue.isEmpty()) {
                Pair p = queue.poll();
                if (!p.s.equals(best[p.r])) {
                    continue;
                }
                if (p.r == 0) {
                    System.out.println(p.s);
                    break;
                }
                for (char d : new char[] { '0', '9' }) {
                    String newStr = p.s + d;
                    int newRem = (p.r * 10 + (d - '0')) % N;
                    if (best[newRem] == null ||
                            newStr.length() < best[newRem].length() ||
                            (newStr.length() == best[newRem].length() && newStr.compareTo(best[newRem]) < 0)) {
                        best[newRem] = newStr;
                        queue.add(new Pair(newStr, newRem));
                    }
                }
            }
        }
    }
}