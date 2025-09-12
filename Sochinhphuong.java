import java.util.Scanner;
import java.lang.Math;

public class Sochinhphuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            long a = sc.nextLong();
            if (Math.sqrt(a) == (int) Math.sqrt(a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}