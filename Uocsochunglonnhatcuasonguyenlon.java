import java.math.BigInteger;
import java.util.Scanner;

public class Uocsochunglonnhatcuasonguyenlon {
    public static BigInteger gcd(BigInteger a, BigInteger b) {
        while (a.compareTo(BigInteger.ZERO) != 0) {
            BigInteger x = a;
            a = b.remainder(a);
            b = x;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger d = gcd(a, b);
            System.out.println(d);
        }
    }
}