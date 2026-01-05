import java.util.*;

public class Capsocostongbangk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            HashMap<Long, Integer> map = new HashMap<>();
            long dem = 0;
            for (int i = 0; i < n; i++) {
                long target = k - arr[i];
                if (map.containsKey(target)) {
                    dem += map.get(target);
                }

                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            System.out.println(dem);
        }
    }
}
