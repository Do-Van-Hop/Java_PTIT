import java.util.*;

class Nhanvien {
    private String maNV;
    private String tenNV;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maST;
    private String ngayKyHopDong;

    void input() {
        Scanner sc = new Scanner(System.in);
        maNV = "00001";
        tenNV = sc.nextLine();
        gioiTinh = sc.nextLine();
        ngaySinh = sc.nextLine();
        diaChi = sc.nextLine();
        maST = sc.nextLine();
        ngayKyHopDong = sc.nextLine();
    }

    void output() {
        System.out.printf("%s %s %s %s %s %s %s", maNV, tenNV, gioiTinh, ngaySinh, diaChi, maST, ngayKyHopDong);
    }
}

public class Khaibaolopnhanvien {
    public static void main(String[] args) {
        Nhanvien nv = new Nhanvien();
        nv.input();
        nv.output();
    }
}
