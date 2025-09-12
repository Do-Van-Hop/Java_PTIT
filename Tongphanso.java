import java.util.Scanner;

public class Tongphanso {

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
        long t1 = sc.nextLong(), m1 = sc.nextLong(), t2 = sc.nextLong(), m2 = sc.nextLong();
        long tu1 = t1 / (gcd(t1, m1)), mau1 = m1 / (gcd(t1, m1)), tu2 = t2 / (gcd(t2, m2)), mau2 = m2 / (gcd(t2, m2));
        long tu_new = tu1 * mau2 + tu2 * mau1, mau_new = mau1 * mau2;
        long tu = tu_new / (gcd(tu_new, mau_new)), mau = mau_new / (gcd(tu_new, mau_new));
        System.out.println(tu + "/" + mau);
    }
}