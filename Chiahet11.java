import java.math.BigInteger;
import java.util.Scanner;

public class Chiahet11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = new BigInteger("11");
            BigInteger remainder = a.remainder(b);
            if (remainder.compareTo(BigInteger.ZERO) == 0)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}