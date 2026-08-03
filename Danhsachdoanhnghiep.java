import java.util.*;
import java.io.*;

public class Danhsachdoanhnghiep {
    static class doanhNghiep {
        String maDn, tenDn;
        int soLuong;

        public doanhNghiep(String maDn, String tenDn, int soLuong) {
            this.maDn = maDn;
            this.tenDn = tenDn;
            this.soLuong = soLuong;
        }

        @Override
        public String toString() {
            return maDn + " " + tenDn + " " + soLuong;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<doanhNghiep> List = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String maDn = sc.nextLine();
            String tenDn = sc.nextLine();
            int soLuong = Integer.parseInt(sc.nextLine());
            List.add(new doanhNghiep(maDn, tenDn, soLuong));
        }
        List.sort((doanhNghiep a, doanhNghiep b) -> {
            return a.maDn.compareTo(b.maDn);
        });
        for (doanhNghiep dn : List) {
            System.out.println(dn);
        }
        sc.close();
    }
}
