import java.util.Scanner;

public class Chuso4vaChuso7c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int l = n.length();
        int t = 0;
        for (int i = 0; i < l; i++)
            if (n.charAt(i) == '4' || n.charAt(i) == '7')
                t++;
        if (t == 4 || t == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}