public import java.util.*;

public class Tinhluong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, String> deptMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            if (line.length() < 2) {
                continue;
            }
            String code = line.substring(0, 2);
            String name = line.substring(2).trim();
            deptMap.put(code, name);
        }

        int m = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < m; i++) {
            String empCode = sc.nextLine().trim();
            String empName = sc.nextLine().trim();
            int basic = Integer.parseInt(sc.nextLine().trim());
            int days = Integer.parseInt(sc.nextLine().trim());

            char group = empCode.charAt(0);
            String yearsStr = empCode.substring(1, 3);
            int years = Integer.parseInt(yearsStr);
            String deptCode = empCode.substring(3);

            String deptName = deptMap.getOrDefault(deptCode, "");

            int mul = getMultiplier(group, years);
            long salary = (long) basic * days * mul * 1000;

            System.out.println(empCode + " " + empName + " " + deptName + " " + salary);
        }
    }

    private static int getMultiplier(char group, int years) {
        switch (group) {
            case 'A':
                if (years >= 1 && years <= 3)
                    return 10;
                else if (years >= 4 && years <= 8)
                    return 12;
                else if (years >= 9 && years <= 15)
                    return 14;
                else
                    return 20;
            case 'B':
                if (years >= 1 && years <= 3)
                    return 10;
                else if (years >= 4 && years <= 8)
                    return 11;
                else if (years >= 9 && years <= 15)
                    return 13;
                else
                    return 16;
            case 'C':
                if (years >= 1 && years <= 3)
                    return 9;
                else if (years >= 4 && years <= 8)
                    return 10;
                else if (years >= 9 && years <= 15)
                    return 12;
                else
                    return 14;
            case 'D':
                if (years >= 1 && years <= 3)
                    return 8;
                else if (years >= 4 && years <= 8)
                    return 9;
                else if (years >= 9 && years <= 15)
                    return 11;
                else
                    return 13;
            default:
                return 1;
        }
    }
}