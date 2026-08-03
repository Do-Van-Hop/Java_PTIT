import java.util.*;
import java.text.*;
import java.io.*;

public class Thoigianonlinelientuc {
    static class online {
        String name, start, end;
        long total;

        public online(String n, String s, String e) {
            name = n;
            start = s;
            end = e;
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            try {
                total = f.parse(end).getTime() - f.parse(start).getTime();
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return name + " " + total / 60000;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<online> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String start = sc.nextLine();
            String end = sc.nextLine();
            list.add(new online(name, start, end));
        }
        list.sort((online x, online y) -> {
            if (x.total == y.total) {
                return x.name.compareTo(y.name);
            } else {
                return y.total > x.total ? 1 : -1;
            }
        });
        list.forEach(x -> System.out.println(x));
    }
}
