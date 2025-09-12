import java.util.*;

public class Tongnsodau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a-- > 0) {
            long t = sc.nextLong();
            System.out.println((1 + t) * t / 2);
        }
    }
}