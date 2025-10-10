import java.util.*;
import java.util.stream.Collectors;

public class Quanlibaitapnhom {
    static String standardizeName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return name;
        }

        return Arrays.stream(name.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .map(word -> Character.toUpperCase(word.charAt(0)) +
                        word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }

    static class Student {
        private final String studentId;
        private final String name;
        private final String phoneNumber;
        private final int groupIndex;

        public Student(String studentId, String name, String phoneNumber, int groupIndex) {
            this.studentId = studentId;
            this.name = standardizeName(name);
            this.phoneNumber = phoneNumber;
            this.groupIndex = groupIndex;
        }

        public int getGroupIndex() {
            return groupIndex;
        }

        @Override
        public String toString() {
            return studentId + " " + name + " " + phoneNumber;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = scanner.nextInt();
        int groupCount = scanner.nextInt();
        scanner.nextLine();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            String studentId = scanner.nextLine();
            String name = scanner.nextLine();
            String phoneNumber = scanner.next();
            int groupIndex = scanner.nextInt();
            scanner.nextLine();

            students.add(new Student(studentId, name, phoneNumber, groupIndex));
        }

        String[] assignments = new String[groupCount + 1];
        for (int i = 1; i <= groupCount; i++) {
            assignments[i] = scanner.nextLine();
        }

        Map<Integer, List<Student>> studentsByGroup = students.stream()
                .collect(Collectors.groupingBy(Student::getGroupIndex));

        int queryCount = scanner.nextInt();
        for (int i = 0; i < queryCount; i++) {
            int groupNumber = scanner.nextInt();

            System.out.printf("DANH SACH NHOM %d:\n", groupNumber);

            List<Student> groupStudents = studentsByGroup.getOrDefault(groupNumber, Collections.emptyList());
            groupStudents.forEach(System.out::println);

            System.out.printf("Bai tap dang ky: %s\n", assignments[groupNumber]);
        }

        scanner.close();
    }
}