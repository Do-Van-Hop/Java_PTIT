import java.util.Scanner;

public class Phanso {

    public static Long gcd(Long a, Long b) {
        while (a != 0) {
            Long x = a;
            a = b % a;
            b = x;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong(), m = sc.nextLong();
        long tu = t / (gcd(t, m)), mau = m / (gcd(t, m));
        System.out.println(tu + "/" + mau);
        sc.close();
    }
}