import java.util.Scanner;

class SinhVien {
    private String maSV, hoTen, lop, ngaySinh;
    private float gpa;

    public SinhVien(int stt, String hoTen, String lop, String ngaySinh, float gpa) {
        this.maSV = String.format("B20DCCN%03d", stt);
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = chuanHoaNgay(ngaySinh);
        this.gpa = gpa;
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

public class Danhsachdoituongsinhvien1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.next();
            float gpa = sc.nextFloat();
            sc.nextLine();

            SinhVien sv = new SinhVien(i, hoTen, lop, ngaySinh, gpa);
            System.out.println(sv);
        }
        sc.close();
    }
}