import java.util.*;
import java.text.*;

public class Timthukhoacuakythi {
    static String toD(String s) {
        String[] d = s.split("/");
        for (int i = 0; i <= 1; i++) {
            while (d[i].length() < 2)
                d[i] = "0" + d[i];
        }
        return d[0] + "/" + d[1] + "/" + d[2];
    }

    static String stdName(String s) {
        String[] n = s.toLowerCase().trim().split("\\s+");
        String r = "";
        for (int i = 0; i < n.length; i++) {
            r = r + Character.toString(n[i].charAt(0)).toUpperCase() + n[i].substring(1) + " ";
        }
        return r;
    }

    static class ThuKhoa {
        String hoTen, ngaySinh;
        int id;
        float tongDiem;

        public ThuKhoa(int i, String n, String d, float a, float b, float c) {
            id = i;
            hoTen = n;
            ngaySinh = d;
            tongDiem = a + b + c;
        }

        @Override
        public String toString() {
            return id + " " + hoTen + ' ' + ngaySinh + ' ' + String.format("%.1f", tongDiem);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThuKhoa> a = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            a.add(new ThuKhoa(i, sc.nextLine(), sc.next(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
        }
        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        a.sort((ThuKhoa x, ThuKhoa y) -> {
            if (x.tongDiem == y.tongDiem)
                return x.id - y.id;
            return (int) (y.tongDiem - x.tongDiem);
        });
        a.forEach(e -> {
            if (e.tongDiem == a.get(0).tongDiem)
                System.out.println(e);
        });
    }
}
