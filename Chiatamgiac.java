import java.util.Scanner;
import java.lang.Math;

public class Chiatamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextDouble(), k = sc.nextDouble();
            for (int i = 1; i < n; i++) {
                double x = Math.sqrt(i / n) * k;
                System.out.printf("%.6f ", x);
            }
            System.out.println();
        }
    }
}