import java.util.*;
import java.math.BigInteger;

public class Souuthe {

    static String check(String s) {
        int chan = 0;
        int le = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return "INVALID";
            }
            if (s.charAt(i) % 2 == 0) {
                chan++;
            } else {
                le++;
            }
        }
        if (chan == le) {
            return "NO";
        }
        if (chan > le && s.length() % 2 == 0) {
            return "YES";
        }
        if (chan < le && s.length() % 2 == 1) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}
