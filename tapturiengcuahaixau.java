import java.util.*;

public class tapturiengcuahaixau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine().trim());
        while (test-- > 0) {
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim();
            Set<String> set1 = new HashSet<>(Arrays.asList(s1.split("\\s+"))),
                    set2 = new HashSet<>(Arrays.asList(s2.split("\\s+")));
            List<String> list = new ArrayList<>();
            for (String x : set1) {
                if (!set2.contains(x)) {
                    list.add(x);
                }
            }
            for (int i = 0; i < list.size(); i++) {

                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}
