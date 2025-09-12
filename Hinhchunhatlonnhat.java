import java.util.*;
import java.io.*;

public class Hinhchunhatlonnhat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long[] h = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                h[i] = Long.parseLong(st.nextToken());
            }
            System.out.println(largestRectangleArea(h));
        }
    }

    public static long largestRectangleArea(long[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        long maxArea = 0;
        int i = 0;
        while (i < n) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                int top = stack.pop();
                long area = heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            long area = heights[top] * (stack.isEmpty() ? n : n - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}