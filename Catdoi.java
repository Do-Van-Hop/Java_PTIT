import java.util.Scanner;

public class Catdoi {

    static String process(String s) {
        boolean hasNonZero = false;
        boolean foundFirstNonZero = false;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char converted;

            // Chuyển đổi trực tiếp không cần hàm riêng
            switch (c) {
                case '0':
                    converted = '0';
                    break;
                case '1':
                    converted = '1';
                    break;
                case '8':
                    converted = '0';
                    break;
                case '9':
                    converted = '0';
                    break;
                default:
                    return "INVALID"; // Ký tự không hợp lệ
            }

            // Bỏ qua số 0 ở đầu trước khi tìm thấy số khác 0
            if (!foundFirstNonZero && converted == '0') {
                continue;
            }

            // Tìm thấy số khác 0 đầu tiên
            if (converted != '0') {
                foundFirstNonZero = true;
                hasNonZero = true;
            }

            result.append(converted);
        }

        // Nếu không có số khác 0 nào
        if (!hasNonZero && result.length() == 0) {
            return "INVALID";
        }

        // Trường hợp tất cả đều là 0
        if (result.length() == 0) {
            return "0";
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            System.out.println(process(s));
        }
        sc.close();
    }
}