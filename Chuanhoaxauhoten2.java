import java.util.*;
import java.io.*;

public class Chuanhoaxauhoten2 {
    public static String chuanHoaTen(String name) {
        String[] arr = name.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String name = sc.nextLine();
            name = chuanHoaTen(name);
            String[] arr = name.split("\\s+");
            for (int i = 1; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print(", " + arr[0].toUpperCase());
            System.out.println();
        }
        sc.close();
    }
}