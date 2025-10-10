import java.util.*;
import java.text.DecimalFormat;

public class Bangtinhgiochuan {

    static class Teacher {
        String code;
        String name;
        double totalHours;

        Teacher(String code, String name) {
            this.code = code;
            this.name = name;
        }

        void addHours(double hours) {
            totalHours += hours;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++)
                sc.nextLine();

            int m = Integer.parseInt(sc.nextLine());
            Map<String, Teacher> teachers = new LinkedHashMap<>();

            for (int i = 0; i < m; i++) {
                String[] parts = sc.nextLine().split(" ", 2);
                teachers.put(parts[0], new Teacher(parts[0], parts[1]));
            }
            int k = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < k; i++) {
                String[] parts = sc.nextLine().split(" ");
                String teacherCode = parts[0];
                double hours = Double.parseDouble(parts[2]);

                Teacher t = teachers.get(teacherCode);
                if (t != null)
                    t.addHours(hours);
            }
            DecimalFormat df = new DecimalFormat("0.00");
            teachers.values().forEach(t -> System.out.println(t.name + " " + df.format(t.totalHours)));
        }
    }
}
