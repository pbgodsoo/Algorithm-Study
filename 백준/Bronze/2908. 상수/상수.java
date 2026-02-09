import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        if (Integer.parseInt(a) > Integer.parseInt(b)) {
            System.out.println(a);
        } else System.out.println(b);
    }
}
