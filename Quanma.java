import java.util.*;

public class Quanma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        int[] dr = { -2, -1, 1, 2, 2, 1, -1, -2 };
        int[] dc = { 1, 2, 2, 1, -1, -2, -2, -1 };

        while (T-- > 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            String start = tokens[0];
            String end = tokens[1];

            int sCol = start.charAt(0) - 'a';
            int sRow = start.charAt(1) - '1';
            int eCol = end.charAt(0) - 'a';
            int eRow = end.charAt(1) - '1';

            if (sRow == eRow && sCol == eCol) {
                System.out.println(0);
                continue;
            }

            int[][] dist = new int[8][8];
            for (int i = 0; i < 8; i++) {
                Arrays.fill(dist[i], -1);
            }

            Queue<int[]> queue = new LinkedList<>();
            dist[sRow][sCol] = 0;
            queue.add(new int[] { sRow, sCol });

            while (!queue.isEmpty()) {
                int[] cell = queue.poll();
                int r = cell[0], c = cell[1];
                if (r == eRow && c == eCol) {
                    System.out.println(dist[r][c]);
                    break;
                }
                for (int d = 0; d < 8; d++) {
                    int nr = r + dr[d];
                    int nc = c + dc[d];
                    if (nr >= 0 && nr < 8 && nc >= 0 && nc < 8 && dist[nr][nc] == -1) {
                        dist[nr][nc] = dist[r][c] + 1;
                        queue.add(new int[] { nr, nc });
                    }
                }
            }
        }
    }
}