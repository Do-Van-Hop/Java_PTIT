import java.util.*;

public class Sodep2 {
    public static Boolean Check(String n) {
        String a = "";
        int t = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(0) != '8' || n.charAt(n.length() - 1) != '8') {
                return false;
            }
            a = n.charAt(i) + a;
            t += (int) n.charAt(i) - '0';
        }
        if (n.compareTo(a) == 0 && t % 10 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String a = sc.next();
            if (Check(a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}