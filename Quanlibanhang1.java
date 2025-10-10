import java.util.*;
import java.util.stream.Collectors;

public class Quanlibanhang1 {
    static String standardizeName(String s) {
        if (s == null || s.trim().isEmpty())
            return "";

        return Arrays.stream(s.trim().toLowerCase().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));
    }

    static class Product {
        private static int nextId = 1;

        final String code;
        final String name;
        final String unit;
        final long importPrice;
        final long salePrice;

        public Product(String name, String unit, long importPrice, long salePrice) {
            this.code = "MH" + String.format("%03d", nextId++);
            this.name = name;
            this.unit = unit;
            this.importPrice = importPrice;
            this.salePrice = salePrice;
        }
    }

    static class Customer {
        private static int nextId = 1;

        final String code;
        final String name;
        final String gender;
        final String birthDate;
        final String address;

        public Customer(String name, String gender, String birthDate, String address) {
            this.code = "KH" + String.format("%03d", nextId++);
            this.name = standardizeName(name); // Áp dụng chuẩn hóa tên
            this.gender = gender;
            this.birthDate = birthDate;
            this.address = address;
        }
    }

    static class Invoice {
        private static int nextId = 1;

        final String code;
        final Product product;
        final Customer customer;
        final long quantity;
        final long totalAmount;

        public Invoice(Product product, Customer customer, long quantity) {
            this.code = "HD" + String.format("%03d", nextId++);
            this.product = product;
            this.customer = customer;
            this.quantity = quantity;
            this.totalAmount = product.salePrice * quantity;
        }

        @Override
        public String toString() {
            return String.format("%s %s %s %s %s %d %d %d %d",
                    code, customer.name, customer.address,
                    product.name, product.unit, product.importPrice,
                    product.salePrice, quantity, totalAmount);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customerCount = Integer.parseInt(sc.nextLine());
        Map<String, Customer> customerMap = new HashMap<>();

        for (int i = 0; i < customerCount; i++) {
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String birthDate = sc.nextLine();
            String address = sc.nextLine();

            Customer customer = new Customer(name, gender, birthDate, address);
            customerMap.put(customer.code, customer);
        }

        int productCount = Integer.parseInt(sc.nextLine());
        Map<String, Product> productMap = new HashMap<>();

        for (int i = 0; i < productCount; i++) {
            String name = sc.nextLine();
            String unit = sc.nextLine();
            long importPrice = Long.parseLong(sc.nextLine());
            long salePrice = Long.parseLong(sc.nextLine());

            Product product = new Product(name, unit, importPrice, salePrice);
            productMap.put(product.code, product);
        }
        int invoiceCount = Integer.parseInt(sc.nextLine());
        List<Invoice> invoices = new ArrayList<>();

        for (int i = 0; i < invoiceCount; i++) {
            String[] invoiceData = sc.nextLine().split(" ");
            String customerCode = invoiceData[0];
            String productCode = invoiceData[1];
            long quantity = Long.parseLong(invoiceData[2]);

            Customer customer = customerMap.get(customerCode);
            Product product = productMap.get(productCode);

            if (customer != null && product != null) {
                invoices.add(new Invoice(product, customer, quantity));
            } else {
                System.err.println("Không tìm thấy khách hàng hoặc sản phẩm: " +
                        customerCode + ", " + productCode);
            }
        }

        invoices.forEach(System.out::println);

        sc.close();
    }
}