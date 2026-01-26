import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] standard = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < standard.length; i++) {
            int input = Integer.parseInt(st.nextToken());
            sb.append(standard[i]-input).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
