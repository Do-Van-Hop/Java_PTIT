import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SinhVien {
    String maSV, hoTen, lop, ngaySinh;
    float gpa;
    int order;

    public SinhVien(int stt, String hoTen, String lop, String ngaySinh, float gpa) {
        this.maSV = String.format("B20DCCN%03d", stt);
        this.hoTen = chuanHoaTen(hoTen);
        this.lop = lop;
        this.ngaySinh = chuanHoaNgay(ngaySinh);
        this.gpa = gpa;
        this.order = stt;
    }

    private String chuanHoaTen(String s) {
        String[] words = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(' ');
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private String chuanHoaNgay(String s) {
        String[] parts = s.split("/");
        if (parts[0].length() == 1)
            parts[0] = "0" + parts[0];
        if (parts[1].length() == 1)
            parts[1] = "0" + parts[1];
        return parts[0] + "/" + parts[1] + "/" + parts[2];
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", maSV, hoTen, lop, ngaySinh, gpa);
    }
}

public class Danhsachdoituongsinhvien3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<SinhVien> SV = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            String hoTen = sc.nextLine();
            String lop = sc.next();
            String ngaySinh = sc.next();
            float gpa = sc.nextFloat();
            sc.nextLine();

            SV.add(new SinhVien(i, hoTen, lop, ngaySinh, gpa));
        }

        SV.sort((s1, s2) -> {
            if (Float.compare(s2.gpa, s1.gpa) != 0) {
                return Float.compare(s2.gpa, s1.gpa);
            }
            return Integer.compare(s1.order, s2.order);
        });

        for (SinhVien st : SV) {
            System.out.println(st);
        }
        sc.close();
    }
}