import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            if(i == 2) {
                list.add(i);
                continue;
            }
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    break;
                }
                if(i-1 == j) list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        if(list.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
