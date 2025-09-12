import java.util.*;

public class Daodau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        long total = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (k > 0 && a[i] < 0) {
                a[i] = -a[i];
                k--;
            }
            total += a[i];
            if (a[i] < min) {
                min = a[i];
            }
        }

        if (k % 2 == 1) {
            total -= 2L * min;
        }

        System.out.println(total);
    }
}