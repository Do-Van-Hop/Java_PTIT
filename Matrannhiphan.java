import java.util.Scanner;

public class Matrannhiphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = sc.nextInt() + sc.nextInt() + sc.nextInt();
            if (sum >= 2) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}