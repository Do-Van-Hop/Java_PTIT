import java.io.*;
import java.util.*;

public class Tonguocso {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 2000000;
        int[] spf = new int[max + 1];

        // Precompute smallest prime factor
        for (int i = 2; i <= max; i++) {
            if (spf[i] == 0) {
                spf[i] = i;
                for (int j = i; j <= max; j += i) {
                    if (spf[j] == 0) {
                        spf[j] = i;
                    }
                }
            }
        }

        int n = Integer.parseInt(br.readLine());
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            while (num > 1) {
                int p = spf[num];
                totalSum += p;
                num /= p;
            }
        }

        System.out.println(totalSum);
    }
}