import java.util.*;
import java.lang.Math;

class HCN {
    private double width, hight;
    private String color;

    void input() {
        Scanner sc = new Scanner(System.in);
        width = sc.nextDouble();
        hight = sc.nextDouble();
        color = sc.next();
    }

    double area() {
        return width * hight;
    }

    double perimeter() {
        return (width + hight) * 2;
    }

    String getColor() {
        color = color.toLowerCase();
        return color.substring(0, 1).toUpperCase() + color.substring(1);
    }

    void output() {
        if (width <= 0 || hight <= 0) {
            System.out.println("INVALID");
        } else {
            System.out.printf("%.0f %.0f %s", perimeter(), area(), getColor());
        }
    }
}

public class Khaibaolophinhchunhat {

    public static void main(String[] args) {
        HCN hcn = new HCN();
        hcn.input();
        hcn.output();
    }
}
