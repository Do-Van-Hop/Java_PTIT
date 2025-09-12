import java.util.*;

public class Inmatran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int a[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                int p1, p2, p3;
                if (i % 2 == 0) {
                    p1 = 0;
                    p2 = n - 1;
                    p3 = 1;
                } else {
                    p1 = n - 1;
                    p2 = 0;
                    p3 = -1;
                }
                for (int j = p1; j != p2 + p3; j += p3) {
                    System.out.printf("%d ", a[i][j]);
                }
            }
            System.out.println();
        }
    }
}
