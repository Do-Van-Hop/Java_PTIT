import java.util.*;
import java.io.*;
import java.text.*;

public class Danhsachkhachhangtrongfile {
    static String chuanHoaNgay(String date) {
        String[] arr = date.split("/");
        if (arr[0].length() == 1) {
            arr[0] = "0" + arr[0];
        }
        if (arr[1].length() == 1) {
            arr[1] = "0" + arr[1];
        }
        return arr[0] + "/" + arr[1] + "/" + arr[2];
    }

    static String chuanHoaTen(String name) {
        String[] arr = name.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    static class khachHang {
        String maKh, name, sex, strdate, address;
        Long date;

        public khachHang(int i, String name, String sex, String data, String address) {
            this.maKh = "KH" + String.format("%03d", i);
            this.name = chuanHoaTen(name);
            this.sex = sex;
            this.strdate = chuanHoaNgay(data);
            this.address = address;
            try {
                SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                this.date = f.parse(data).getTime();
            } catch (ParseException e) {
            }
        }

        @Override
        public String toString() {
            return maKh + " " + name + " " + sex + " " + address + " " + strdate;
        }
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        ArrayList<khachHang> a = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            a.add(new khachHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        a.sort((khachHang x, khachHang y) -> x.date.compareTo(y.date));
        a.forEach(e -> System.out.println(e));
    }
}
