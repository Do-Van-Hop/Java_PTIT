import java.util.*;

public class Tinhtoanhoadonquanao {
    static class Product {
        String code;
        String name;
        long price1;
        long price2;

        public Product(String code, String name, long price1, long price2) {
            this.code = code;
            this.name = name;
            this.price1 = price1;
            this.price2 = price2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, Product> productMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String code = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            long price1 = Long.parseLong(sc.nextLine().trim());
            long price2 = Long.parseLong(sc.nextLine().trim());
            productMap.put(code, new Product(code, name, price1, price2));
        }

        int m = Integer.parseInt(sc.nextLine().trim());
        int invoiceCount = 1;

        for (int i = 0; i < m; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split(" ");
            String initialCode = parts[0];
            long quantity = Long.parseLong(parts[1]);

            String productCode = initialCode.substring(0, 2);
            String type = initialCode.substring(2, 3);

            Product product = productMap.get(productCode);
            if (product == null) {
                continue;
            }

            long price = type.equals("1") ? product.price1 : product.price2;
            long total = price * quantity;
            long discount = 0;

            if (quantity >= 150) {
                discount = total * 50 / 100;
            } else if (quantity >= 100) {
                discount = total * 30 / 100;
            } else if (quantity >= 50) {
                discount = total * 15 / 100;
            }

            long pay = total - discount;
            String fullInvoiceCode = initialCode + "-" + String.format("%03d", invoiceCount);
            invoiceCount++;

            System.out.println(fullInvoiceCode + " " + product.name + " " + discount + " " + pay);
        }

        sc.close();
    }
}