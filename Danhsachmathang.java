import java.util.*;

public class Danhsachmathang {

    static class Goods implements Comparable<Goods> {
        String name, unit;
        int buy, sell, profit, code;
        String formattedCode;

        public Goods(String name, String unit, int buy, int sell, int code) {
            this.name = name;
            this.unit = unit;
            this.buy = buy;
            this.sell = sell;
            this.profit = sell - buy;
            this.code = code;
            this.formattedCode = String.format("MH%03d", code);
        }

        @Override
        public int compareTo(Goods other) {
            if (this.profit != other.profit)
                return other.profit - this.profit;
            return this.code - other.code;
        }

        @Override
        public String toString() {
            return formattedCode + " " + name + " " + unit + " "
                    + buy + " " + sell + " " + profit;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Goods[] goods = new Goods[n];

        for (int i = 0; i < n; i++) {
            goods[i] = new Goods(
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextInt(),
                    sc.nextInt(),
                    i + 1);
            sc.nextLine();
        }

        Arrays.sort(goods);

        for (Goods g : goods) {
            System.out.println(g);
        }

        sc.close();
    }
}
