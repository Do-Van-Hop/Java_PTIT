import java.util.*;

public class Bosungdayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == last + 1) {
                last = x;
                continue;
            } else {
                for (int j = last + 1; j < x; j++) {
                    System.out.println(j);
                    count++;
                }
                last = x;
            }
        }
        if (count == 0) {
            System.out.println("Excellent!");
        }
        sc.close();
    }
}
