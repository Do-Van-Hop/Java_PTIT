import java.util.*;
import java.io.*;
import java.math.*;

public class Tachdoitinhtong {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String a = sc.nextLine();
        while (true) {
            if (a.length() == 1) {
                break;
            }
            String b = a.substring(0, a.length() / 2);
            String c = a.substring(a.length() / 2, a.length());
            BigInteger d = new BigInteger(b);
            BigInteger e = new BigInteger(c);
            BigInteger f = d.add(e);
            a = f.toString();
            System.out.println(f);
        }
    }
}
