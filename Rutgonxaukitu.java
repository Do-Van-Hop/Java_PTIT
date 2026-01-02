import java.util.Scanner;

public class Rutgonxaukitu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        StringBuilder result = new StringBuilder();

        for (char c : chars) {
            int len = result.length();
            if (len > 0 && result.charAt(len - 1) == c) {
                result.setLength(len - 1);
            } else {
                result.append(c);
            }
        }

        System.out.println(result.length() == 0 ? "Empty String" : result.toString());
        sc.close();
    }
}