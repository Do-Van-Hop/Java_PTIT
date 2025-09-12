import java.util.*;
import java.util.function.BinaryOperator;
import java.lang.Math;
import java.math.BigInteger;

public class Boichungnhonhat {
    public static BigInteger Gcd(BigInteger a, BigInteger b) {
        BigInteger gcd = a.gcd(b);
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            BigInteger n = sc.nextBigInteger();
            BigInteger t = sc.nextBigInteger();
            System.out.println(n.multiply(t).divide(Gcd(n, t)));
        }
    }
}
