import java.util.*;

public class Sodep3 {
    public static Boolean Check(String n) {
        String a = "";
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != '2' && n.charAt(i) != '3' && n.charAt(i) != '5' && n.charAt(i) != '7') {
                return false;
            }
            a = n.charAt(i) + a;
        }
        if (n.equals(a)) {
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