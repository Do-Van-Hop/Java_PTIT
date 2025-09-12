import java.util.Scanner;

public class uocsochiahetcho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int dem = 0;

            for (long i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    long j = n / i;

                    if (i % 2 == 0)
                        dem++;

                    if (j != i && j % 2 == 0)
                        dem++;
                }
            }
            System.out.println(dem);
        }
    }
}
