import java.util.*;
import java.lang.Math;
import java.math.BigInteger;

public class Boisonhonhatcuansonguyenduongdautien {
    public static Long Gcd(Long a, Long b) {
        BigInteger m = BigInteger.valueOf(a);
        BigInteger n = BigInteger.valueOf(b);
        BigInteger gcd = m.gcd(n);
        return gcd.longValue();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            long n = sc.nextLong();
            long t = 1L;
            for (long i = 1L; i <= n; i++) {
                t = t * i / Gcd(t, i);
            }
            System.out.println(t);
        }
    }
}
