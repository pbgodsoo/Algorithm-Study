import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Integer> list;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list = new ArrayList<>();
            list.add(a);
            list.add(b);
            list.add(c);
            Collections.sort(list);

            if(a == 0 && b == 0 && c == 0) break;
            if(list.get(0)+list.get(1)<=list.get(2)) {
                System.out.println("Invalid");
                continue;
            }
            if(a==b && a==c) {
                System.out.println("Equilateral");
            } else if (a == b || a == c || b == c ) {
                System.out.println("Isosceles");
            } else System.out.println("Scalene");
        }
    }
}
