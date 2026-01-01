import java.util.Scanner;
import java.util.HashMap;

public class Diachiemail {

    static String generateBaseUsername(String s) {
        // Xử lý tên để tạo username cơ bản
        String[] parts = s.trim().toLowerCase().split("\\s+");
        if (parts.length == 0)
            return "";

        StringBuilder username = new StringBuilder();
        // Thêm phần họ (phần cuối cùng)
        username.append(parts[parts.length - 1]);

        // Thêm chữ cái đầu của các phần còn lại
        for (int i = 0; i < parts.length - 1; i++) {
            if (!parts[i].isEmpty()) {
                username.append(parts[i].charAt(0));
            }
        }

        return username.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc số lượng test case
        int t = Integer.parseInt(sc.nextLine().trim());
        HashMap<String, Integer> userCount = new HashMap<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String name = sc.nextLine().trim();

            if (name.isEmpty()) {
                continue;
            }

            // Tạo base username
            String baseUser = generateBaseUsername(name);

            // Kiểm tra và đánh số
            int count = userCount.getOrDefault(baseUser, 0);
            userCount.put(baseUser, count + 1);

            // Tạo email
            String email;
            if (count == 0) {
                email = baseUser + "@ptit.edu.vn";
            } else {
                email = baseUser + (count + 1) + "@ptit.edu.vn";
            }

            output.append(email).append("\n");
        }

        System.out.print(output);
        sc.close();
    }
}