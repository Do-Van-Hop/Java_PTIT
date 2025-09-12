import java.util.*;
import java.lang.Math;

public class solienke {
    public static boolean Check(String s) {
        int sum = s.length();
        for (int i = 1; i < sum; i++)
            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            long a = sc.nextLong();
            if (Check(Long.toString(a))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
