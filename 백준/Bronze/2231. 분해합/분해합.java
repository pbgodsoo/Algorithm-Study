import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum;
        int result = 0;
        for (int i = 0; i < N; i++) {
            String str = String.valueOf(i);
            sum = 0;
            for (int j = 0; j < str.length(); j++) {
                sum += str.charAt(j) - '0';
            }
            if(i + sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
