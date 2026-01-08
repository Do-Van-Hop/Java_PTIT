import java.util.*;
import java.io.*;

public class Xephang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] KhachHang = new int[t][2];
        for (int i = 0; i < t; i++) {
            KhachHang[i] = new int[] { sc.nextInt(), sc.nextInt() };
        }
        Arrays.sort(KhachHang, (a, b) -> Integer.compare(a[0], b[0]));
        int realTime = 0;
        for (int i = 0; i < t; i++) {
            realTime = Math.max(KhachHang[i][0], realTime) + KhachHang[i][1];
        }
        System.out.println(realTime);
        sc.close();
    }
}
