import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Docfilevanban {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()) {
            String t = sc.nextLine();
            System.out.println(t);
        }
    }
}