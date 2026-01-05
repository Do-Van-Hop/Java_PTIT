import java.util.Scanner;
import java.util.Stack;

public class Dayngoacdungdainhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            int maxLen = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    stack.push(i);
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        stack.push(i);
                    } else {
                        maxLen = Math.max(maxLen, i - stack.peek());
                    }
                }
            }
            System.out.println(maxLen);
        }
    }
}