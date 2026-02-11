import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int answer = 0;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(a == 2) {
                answer++;
                continue;
            }
            for (int j = 2; j < a; j++) {
                if(a % j == 0) break;
                if(a-1 == j) answer++;
            }
        }
        System.out.println(answer);
    }
}
