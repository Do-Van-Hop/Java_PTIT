
// Bài này nộp không đúng nha. Nếu sử dụng hàm main của đề bài thì bị tràn bộ nhớ, không sử dụng thì không nộp được. Nếu bạn đi thi hãy viết cách này để thầy cô mà đọc code thì có điểm nha!!!
import java.io.*;
import java.util.StringTokenizer;

public class Bondiemtrenmotmatphang {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long ax = Long.parseLong(st.nextToken());
            long ay = Long.parseLong(st.nextToken());
            long az = Long.parseLong(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long bx = Long.parseLong(st.nextToken());
            long by = Long.parseLong(st.nextToken());
            long bz = Long.parseLong(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long cx = Long.parseLong(st.nextToken());
            long cy = Long.parseLong(st.nextToken());
            long cz = Long.parseLong(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long dx = Long.parseLong(st.nextToken());
            long dy = Long.parseLong(st.nextToken());
            long dz = Long.parseLong(st.nextToken());

            long abx = bx - ax, aby = by - ay, abz = bz - az;
            long acx = cx - ax, acy = cy - ay, acz = cz - az;
            long adx = dx - ax, ady = dy - ay, adz = dz - az;

            long crossX = acy * adz - acz * ady;
            long crossY = acz * adx - acx * adz;
            long crossZ = acx * ady - acy * adx;

            long result = abx * crossX + aby * crossY + abz * crossZ;

            bw.write(result == 0 ? "YES\n" : "NO\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}