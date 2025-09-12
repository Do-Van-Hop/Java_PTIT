import java.util.Scanner;

public class Sotamphan {

    public static boolean Check(String n) {
        int len = n.length();
        for (int i = 0; i < len; i++) {
            if (n.charAt(i) > '2') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String s = sc.next();
            if (Check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}