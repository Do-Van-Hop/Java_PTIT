import java.util.*;

public class Giaocuahaimang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set1.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (set1.contains(x)) {
                set2.add(x);
            }
        }
        List<Integer> list = new ArrayList<>(set2);
        Collections.sort(list);
        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}
