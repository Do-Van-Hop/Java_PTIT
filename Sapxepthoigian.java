import java.util.*;

public class Sapxepthoigian {
    static final int MAX_SECONDS = 24 * 3600;

    static int TinhTime(int h, int m, int s) {
        return h * 3600 + m * 60 + s;
    }

    static void PrintTime(int tong) {
        int h = tong / 3600;
        int m = (tong % 3600) / 60;
        int s = (tong % 3600) % 60;
        System.out.printf("%d %d %d\n", h, m, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = TinhTime(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            PrintTime(a[i]);
        }
    }
}
