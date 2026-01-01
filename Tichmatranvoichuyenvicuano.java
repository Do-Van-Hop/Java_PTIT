import java.util.Scanner;

public class Tichmatranvoichuyenvicuano {

    static int[][] multiplyWithTranspose(int[][] a, int n, int m) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < m; k++) {
                    sum += a[i][k] * a[j][k];
                }
                res[i][j] = sum;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder output = new StringBuilder();

        for (int ts = 1; ts <= t; ts++) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            int[][] res = multiplyWithTranspose(a, n, m);

            output.append("Test ").append(ts).append(":\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    output.append(res[i][j]).append(" ");
                }
                output.append("\n");
            }
        }

        System.out.print(output);
        sc.close();
    }
}