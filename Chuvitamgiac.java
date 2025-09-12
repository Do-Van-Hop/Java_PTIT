import java.util.*;
import java.lang.Math;

class Point {
    double x;
    double y;

    void input(Scanner sc) {
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }

    public double distanceTo(Point p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    double checkTriagle(Point a, Point b) {
        double A = this.distanceTo(a);
        double B = this.distanceTo(b);
        double C = a.distanceTo(b);
        if (A + B > C && B + C > A && A + C > B)
            return A + B + C;
        return -1;
    }
}

public class Chuvitamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point A = new Point();
            Point B = new Point();
            Point C = new Point();
            A.input(sc);
            B.input(sc);
            C.input(sc);
            double k = A.checkTriagle(B, C);
            if (k != -1)
                System.out.printf("%.3f\n", k);
            else
                System.out.println("INVALID");
        }
    }
}
