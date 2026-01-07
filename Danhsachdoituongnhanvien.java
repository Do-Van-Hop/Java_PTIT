import java.util.*;

class NhanVien {
    String maNV;
    String hoTen;
    String gioiTinh;
    String ngaySinh;
    String diaChi;
    String maST;
    String ngayKyHopDong;

    public NhanVien(int stt, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maST,
            String ngayKyHopDong) {
        this.maNV = String.format("%05d", stt);
        this.hoTen = chuanHoaTen(hoTen);
        this.gioiTinh = gioiTinh;
        this.ngaySinh = chuanHoaNgay(ngaySinh);
        this.diaChi = diaChi.trim();
        this.maST = maST;
        this.ngayKyHopDong = ngayKyHopDong;
    }

    private String chuanHoaNgay(String s) {
        String[] d = s.split("/");
        for (int i = 0; i <= 1; i++) {
            while (d[i].length() < 2)
                d[i] = "0" + d[i];
        }
        return d[0] + "/" + d[1] + "/" + d[2];
    }

    private String chuanHoaTen(String s) {
        String[] words = s.trim().toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }

    @Override
    public String toString() {
        return maNV + ' ' + hoTen + gioiTinh + ' ' + ngaySinh + ' ' + diaChi + ' ' + maST + ' ' + ngayKyHopDong;
    }

}

public class Danhsachdoituongnhanvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> a = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            a.add(new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        a.forEach(e -> System.out.println(e));
        sc.close();
    }
}
