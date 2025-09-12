import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String maSinhVien;
    private String hoTen;

    public Student(String maSinhVien, String hoTen) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
    }

    public String getId() {
        return maSinhVien;
    }

    public String getName() {
        return hoTen;
    }
}

class Subject {
    private String maMon;
    private String tenMon;
    private int soTinChi;

    public Subject(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public String getName() {
        return tenMon;
    }

    public int getCredits() {
        return soTinChi;
    }
}

class Rule {
    private String soQuyetDinh;
    private String tenQuyetDinh;
    private int donGia;

    public Rule(String soQuyetDinh, String tenQuyetDinh, int donGia) {
        this.soQuyetDinh = soQuyetDinh;
        this.tenQuyetDinh = tenQuyetDinh;
        this.donGia = donGia;
    }

    public String getNumber() {
        return soQuyetDinh;
    }

    public int getUnitPrice() {
        return donGia;
    }
}

class Invoice {
    private Student sinhVien;
    private List<Subject> danhSachMonHoc;
    private Rule quyDinh;
    private double tongHocPhi;

    public Invoice(Student sinhVien, List<Subject> danhSachMonHoc, Rule quyDinh) {
        this.sinhVien = sinhVien;
        this.danhSachMonHoc = danhSachMonHoc;
        this.quyDinh = quyDinh;
        this.tongHocPhi = tinhTongHocPhi();
    }

    private double tinhTongHocPhi() {
        int tongSoTinChi = 0;
        for (Subject monHoc : danhSachMonHoc) {
            tongSoTinChi += monHoc.getCredits();
        }
        return tongSoTinChi * quyDinh.getUnitPrice();
    }

    public Student getStudent() {
        return sinhVien;
    }

    public List<Subject> getSubjects() {
        return danhSachMonHoc;
    }

    public Rule getRule() {
        return quyDinh;
    }

    public double getTotalFee() {
        return tongHocPhi;
    }
}

class PaymentController {
    public Invoice getInvoice() {
        Scanner sc = new Scanner(System.in);

        String maSinhVien = sc.nextLine();
        String hoTen = sc.nextLine();
        int soLuongMonHoc = Integer.parseInt(sc.nextLine());

        List<Subject> danhSachMonHoc = new ArrayList<>();
        for (int i = 0; i < soLuongMonHoc; i++) {
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            int soTinChi = Integer.parseInt(sc.nextLine());
            danhSachMonHoc.add(new Subject(maMon, tenMon, soTinChi));
        }

        String soQuyetDinh = sc.nextLine();
        String tenQuyetDinh = sc.nextLine();
        int donGia = Integer.parseInt(sc.nextLine());

        Rule quyDinh = new Rule(soQuyetDinh, tenQuyetDinh, donGia);
        Student sinhVien = new Student(maSinhVien, hoTen);

        return new Invoice(sinhVien, danhSachMonHoc, quyDinh);
    }
}

class InvoiceView {
    public static void show(Invoice hoaDon) {
        System.out.println("Mã sinh viên: " + hoaDon.getStudent().getId());
        System.out.println("Họ tên: " + hoaDon.getStudent().getName());
        System.out.println("Các môn học:");
        List<Subject> danhSachMonHoc = hoaDon.getSubjects();
        for (Subject monHoc : danhSachMonHoc) {
            System.out.println(monHoc.getName());
        }
        System.out.println("Học phí phải nộp là: " + hoaDon.getTotalFee());
        System.out.println("Theo QĐ: " + hoaDon.getRule().getNumber());
    }
}

public class Hocphi {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}