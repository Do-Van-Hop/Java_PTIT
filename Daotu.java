import java.util.Scanner;

public class Daotu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String line = sc.nextLine();
            StringBuilder result = new StringBuilder();

            String[] words = line.split(" ");

            for (int i = 0; i < words.length; i++) {
                if (!words[i].isEmpty()) {
                    result.append(new StringBuilder(words[i]).reverse());
                }

                if (i < words.length - 1) {
                    result.append(' ');
                }
            }

            System.out.println(result);
        }
        sc.close();
    }
}