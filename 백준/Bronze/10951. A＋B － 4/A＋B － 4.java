import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String input = "";
        int a = 0;
        int b = 0;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            st = new StringTokenizer(input);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }
    }
}
