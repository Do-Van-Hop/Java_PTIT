import java.io.*;
import java.util.*;

public class Songuyentotrongfilenhiphan {

    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) throws Exception {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));

        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ois.close();

        Map<Integer, Integer> map = new TreeMap<>();

        for (int x : list) {
            if (isPrime(x)) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
