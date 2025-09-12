import java.util.Scanner;
import java.lang.Math;

public class Soxacach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] check = new int[n + 1];
            Try("", n, check);
        }
    }

    public static void Try(String s, int n, int[] check) {
        int k = s.length();
        if (k == n) {
            System.out.println(s);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (check[i] == 0) {
                if (k == 0 || Math.abs(s.charAt(k - 1) - '0' - i) != 1) {
                    check[i] = 1;
                    Try(s + i, n, check);
                    check[i] = 0;
                }
            }
        }
    }
}