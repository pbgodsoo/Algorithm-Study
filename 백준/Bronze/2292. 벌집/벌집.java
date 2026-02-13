import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        int i = 6;
        while (N > 1){
            N = N-i;
            i += 6;
            count++;
        }
        System.out.println(count+1);
    }
}
