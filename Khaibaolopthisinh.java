import java.util.*;

class SinhVien {
    String hoTen;
    String ngaySinh;
    float diem1, diem2, diem3, tong;

    void Input() {
        Scanner sc = new Scanner(System.in);
        hoTen = sc.nextLine();
        ngaySinh = sc.next();
        diem1 = sc.nextFloat();
        diem2 = sc.nextFloat();
        diem3 = sc.nextFloat();
        tong = diem1 + diem2 + diem3;
    }

    void Output() {
        System.out.printf("%s %s %.1f", hoTen, ngaySinh, tong);
    }
}

public class Khaibaolopthisinh {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.Input();
        sv.Output();
    }
}
