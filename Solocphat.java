import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solocphat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> queue = new LinkedList<>();
            ArrayList<String> res = new ArrayList<>();
            queue.offer("6");
            queue.offer("8");
            while (!queue.isEmpty()) {
                String top = queue.poll();
                res.add(0, top);
                if (top.length() < n) {
                    queue.offer(top + "6");
                    queue.offer(top + "8");
                }
            }
            System.out.println(res.size());
            for (String s : res) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}