import java.util.Scanner;
import java.util.Stack;

public class Gobanphim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '-') {
                if (!left.isEmpty())
                    left.pop();
            } else if (c == '<') {
                if (!left.isEmpty())
                    right.push(left.pop());
            } else if (c == '>') {
                if (!right.isEmpty())
                    left.push(right.pop());
            } else {
                left.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : left)
            sb.append(ch);
        while (!right.isEmpty())
            sb.append(right.pop());

        System.out.println(sb);
        sc.close();
    }
}