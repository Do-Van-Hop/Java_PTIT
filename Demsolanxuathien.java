import java.util.*;

public class Demsolanxuathien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int k = 1; k <= t; k++) {
            System.out.printf("Test %d:\n", k);
            int n = sc.nextInt();
            Map<Integer, Integer> kq = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                kq.put(num, kq.getOrDefault(num, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : kq.entrySet()) {
                System.out.printf("%d xuat hien %d lan\n", entry.getKey(), entry.getValue());
            }
        }
    }
}