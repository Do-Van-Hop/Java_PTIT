import java.util.Scanner;

public class Sapxepchen {

    static void InKq(int[] arr, int n, int step) {
        StringBuilder sb = new StringBuilder();
        sb.append("Buoc ").append(step).append(": ");
        for (int i = 0; i <= step; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            InKq(arr, n, i);
        }
        sc.close();
    }
}