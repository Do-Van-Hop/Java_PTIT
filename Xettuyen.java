import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Xettuyen {
    static String std(String s) {
        String[] n = s.split("/");
        String r = "";
        for (String x : n) {
            if (x.length() == 1)
                x = "0" + x;
            r += x + "/";
        }
        return r;
    }

    static String StdName(String s) {
        String[] n = s.toLowerCase().trim().split("\\s+");
        String r = "";
        for (String x : n) {
            r += Character.toString(x.charAt(0)).toUpperCase() + x.substring(1) + " ";
        }
        return r.trim();
    }

    static class Candidate {
        String name, date, id, type;
        float lt, th, plus;
        int sum, age;

        public Candidate(int i, String name, String date, float lt, float th) {
            this.id = String.format("PH%02d", i);
            this.name = StdName(name);
            this.date = std(date);
            this.age = 2021 - Integer.parseInt(date.split("/")[2]); // Test case ở 2021 - Không nhập năm hiện tại
            this.lt = lt;
            this.th = th;
            if (lt >= 8 && th >= 8)
                plus = 1;
            else if (lt >= 7.5 && th >= 7.5)
                plus = 0.5f;
            else
                plus = 0;
            sum = (int) Math.round((lt + th) / 2 + plus);
            if (sum > 10)
                sum = 10;
            if (sum >= 9)
                type = "Xuat sac";
            else if (sum == 8)
                type = "Gioi";
            else if (sum == 7)
                type = "Kha";
            else if (sum >= 5)
                type = "Trung binh";
            else
                type = "Truot";
        }

        @Override
        public String toString() {
            return id + " " + name + " " + age + " " + sum + " " + type;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = sc.nextInt();
        ArrayList<Candidate> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String date = sc.next();
            float lt = Float.parseFloat(sc.next());
            float th = Float.parseFloat(sc.next());
            a.add(new Candidate(i, name, date, lt, th));
        }
        for (Candidate s : a) {
            System.out.println(s);
        }
    }
}
