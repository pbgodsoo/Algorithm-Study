import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int max = -1;
        int row = 0;
        int col = 0;

        for(int i=1; i<=9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num > max) {
                    max = num;
                    row = i;
                    col = j;
                }
            }
        }
        sb.append(max).append("\n");
        sb.append(row).append(" ").append(col);
        System.out.println(sb);
    }
}
