import java.util.*;
import java.io.*;

public class Danhsachsanpham2 {
    static class sanpham {
        String maSp, tenSp;
        int price, guarantee;

        public sanpham(String maSp, String tenSp, int price, int guarantee) {
            this.maSp = maSp;
            this.tenSp = tenSp;
            this.price = price;
            this.guarantee = guarantee;
        }

        @Override
        public String toString() {
            return maSp + " " + tenSp + " " + price + " " + guarantee;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sanpham> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String maSp = sc.nextLine();
            String tenSp = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int guarantee = Integer.parseInt(sc.nextLine());
            list.add(new sanpham(maSp, tenSp, price, guarantee));
        }
        list.sort((sanpham a, sanpham b) -> {
            if (a.price == b.price) {
                return a.maSp.compareTo(b.maSp);
            } else {
                return b.price > a.price ? 1 : -1;
            }
        });
        for (sanpham sp : list) {
            System.out.println(sp);
        }
    }
}
