import java.util.Scanner;
import java.lang.Math;

public class Tonggiaithua {
    public static long GiaiThua(int n) {
        if (n == 0)
            return 1;
        return n * GiaiThua(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        long n = 0;
        if (t == 0 || t == 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= t; i++) {
                n += GiaiThua(i);
            }
            System.out.println(n);
        }
    }
}