import java.util.Scanner;

public class Lietketohop2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k <= 0 || k > n) {
            System.out.println("Tong cong co 0 to hop");
            sc.close();
            return;
        }
        int[] comb = new int[k];
        StringBuilder output = new StringBuilder();
        int count = 0;

        for (int i = 0; i < k; i++) {
            comb[i] = i + 1;
        }

        while (true) {
            count++;
            for (int i = 0; i < k; i++) {
                output.append(comb[i]);
            }
            output.append(' ');
            int i = k - 1;
            while (i >= 0 && comb[i] == n - k + i + 1) {
                i--;
            }

            if (i < 0) {
                break;
            }

            comb[i]++;

            for (int j = i + 1; j < k; j++) {
                comb[j] = comb[j - 1] + 1;
            }
        }

        System.out.println(output.toString().trim());
        System.out.printf("Tong cong co %d to hop", count);
        sc.close();
    }
}