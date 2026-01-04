import java.util.*;

public class Sophuc {
    static class Complex {
        int real, imag;

        Complex(int real, int imag) {
            this.real = real;
            this.imag = imag;
        }

        Complex add(Complex c) {
            return new Complex(this.real + c.real, this.imag + c.imag);
        }

        Complex mul(Complex c) {
            int newReal = this.real * c.real - this.imag * c.imag;
            int newImag = this.real * c.imag + this.imag * c.real;
            return new Complex(newReal, newImag);
        }

        @Override
        public String toString() {
            if (imag < 0) {
                return real + " - " + -imag + "i";
            } else {
                return real + " + " + imag + "i";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Complex a = new Complex(sc.nextInt(), sc.nextInt());
            Complex b = new Complex(sc.nextInt(), sc.nextInt());
            Complex sum = a.add(b);
            Complex c = sum.mul(a);
            Complex d = sum.mul(sum);
            System.out.println(c + ", " + d);
        }
        sc.close();
    }
}
