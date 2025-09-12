import java.util.Scanner;

public class uocsonguyentolonhat {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            long a = sc.nextLong();
            long kq = 0L;
            for (long i = 2L; i * i <= a; i++) {
                if (a % i == 0) {
                    kq = i;
                    while (a % i == 0) {
                        a /= i;
                    }
                }
            }
            if (a > 1) {
                kq = a;
            }
            System.out.println(kq);
        }
    }
}
