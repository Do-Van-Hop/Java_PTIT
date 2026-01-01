import java.util.Scanner;

public class Phantichthuasonguyento {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            System.out.printf("Test %d: ", i);

            // Xử lý số 2 riêng biệt
            int cnt = 0;
            while (n % 2 == 0) {
                n /= 2;
                cnt++;
            }
            if (cnt > 0) {
                System.out.printf("2(%d) ", cnt);
            }

            // Chỉ duyệt các số lẻ từ 3
            for (int j = 3; j * j <= n; j += 2) {
                cnt = 0;
                while (n % j == 0) {
                    n /= j;
                    cnt++;
                }
                if (cnt > 0) {
                    System.out.printf("%d(%d) ", j, cnt);
                }
            }

            // Nếu n còn lại > 1, đó là số nguyên tố
            if (n > 1) {
                System.out.printf("%d(1)", n);
            }
            System.out.println();
        }
        sc.close();
    }
}