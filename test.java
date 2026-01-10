public class test {
    class check {
        public String chuanHoaTen(String s) {
            String[] arr = s.trim().toLowerCase().split("\\s+");
            String res = "";
            for (String x : arr) {
                res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
            }
            return res.trim();
        }
    }

    public long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
