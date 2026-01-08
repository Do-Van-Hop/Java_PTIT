import java.util.*;

public class Sapxepdanhsachmathang {
    static class MatHang {
        String name, group;
        double buy, sell, profit;
        int id;

        public MatHang(int id, String name, String group, double buy, double sell) {
            this.id = id;
            this.name = name;
            this.group = group;
            this.buy = buy;
            this.sell = sell;
            this.profit = sell - buy;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + group + " " + String.format("%.2f", profit);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            a.add(new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        a.sort((MatHang x, MatHang y) -> {
            return (int) (y.profit - x.profit);
        });
        a.forEach(e -> {
            System.out.println(e);
        });
    }
}
