import java.util.*;

public class Matranxoanoctangdan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                list.add(matrix[i][j]);
            }
        }

        Collections.sort(list);

        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int index = 0;

        while (index < n * n) {
            for (int i = left; i <= right && index < n * n; i++) {
                matrix[top][i] = list.get(index++);
            }
            top++;

            for (int i = top; i <= bottom && index < n * n; i++) {
                matrix[i][right] = list.get(index++);
            }
            right--;

            for (int i = right; i >= left && index < n * n; i--) {
                matrix[bottom][i] = list.get(index++);
            }
            bottom--;

            for (int i = bottom; i >= top && index < n * n; i--) {
                matrix[i][left] = list.get(index++);
            }
            left++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}