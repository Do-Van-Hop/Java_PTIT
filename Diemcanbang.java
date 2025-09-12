import java.util.Scanner;

public class Diemcanbang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            long s = 0;
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                s += a[i];
            }
            long x = 0;
            int p = -1;
            for (int i = 1; i <= n; i++) {
                if (2 * x + a[i] == s) {
                    p = i;
                    break;
                }
                x += a[i];
            }
            System.out.println(p);
        }
    }
}