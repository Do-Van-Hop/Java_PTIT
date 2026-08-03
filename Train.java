import java.util.*;
import java.io.*;

public class Train {
    static String StdName(String s) {
        String[] n = s.toLowerCase().trim().split("\\s+");
        String r = "";
        for (String x : n) {
            r += Character.toString(x.charAt(0)).toUpperCase() + x.substring(1) + " ";
        }
        return r.trim();
    }

    static class Student {
        String name, id, type;
        float d1, d2, d3, sum;

        public Student(int i, String name, float d1, float d2, float d3) {
            this.id = String.format("SV%02d", i);
            this.name = StdName(name);
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            this.sum = d1 / 100 * 25 + d2 / 100 * 35 + d3 / 100 * 40;
            if (sum >= 8)
                type = "GIOI";
            else if (sum >= 6.5)
                type = "KHA";
            else if (sum >= 5)
                type = "TRUNG BINH";
            else
                type = "KEM";
        }

        @Override
        public String toString() {
            return id + " " + name + " " + String.format("%.2f", sum) + " " + type;
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String name = sc.nextLine();
            float d1 = Float.parseFloat(sc.nextLine());
            float d2 = Float.parseFloat(sc.nextLine());
            float d3 = Float.parseFloat(sc.nextLine());
            a.add(new Student(i, name, d1, d2, d3));
        }
        a.sort((x, y) -> {
            if (x.sum != y.sum) {
                return Float.compare(y.sum, x.sum);
            }
            return x.id.compareTo(y.id);
        });
        for (Student s : a) {
            System.out.println(s);
        }
    }
}