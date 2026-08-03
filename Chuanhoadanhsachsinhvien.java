import java.util.*;
import java.io.*;

public class Chuanhoadanhsachsinhvien {
    static String stdName(String s) {
        String[] n = s.toLowerCase().trim().split("\\s+");
        String r = "";
        for (String x : n) {
            r += Character.toString(x.charAt(0)).toUpperCase() + x.substring(1) + " ";
        }
        return r.trim();
    }

    static String stdDate(String s) {
        String[] n = s.split("/");
        String r = "";
        for (String x : n) {
            x = String.format("%02d", Integer.parseInt(x));
            r += x + "/";
        }
        return r.substring(0, r.length() - 1);
    }

    static class Student {
        String name, maSV, maLop, date;
        double gpa;

        public Student(int i, String name, String maLop, String date, double gpa) {
            this.maSV = "B20DCCN" + String.format("%03d", i);
            this.name = stdName(name);
            this.maLop = maLop;
            this.date = stdDate(date);
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return maSV + " " + name + " " + maLop + " " + date + " " + String.format("%.02f", gpa);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = sc.nextInt();
        ArrayList<Student> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            a.add(new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }
        for (Student s : a) {
            System.out.println(s);
        }
    }
}
