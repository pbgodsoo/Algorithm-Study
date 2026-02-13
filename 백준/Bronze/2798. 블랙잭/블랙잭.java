import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        
        int result = 0;
        int sum = 0;
        for (int i = 0; i < list.size()-2; i++) {
            for (int j = i+1; j < list.size(); j++) {
                for (int k = j+1; k < list.size(); k++) {
                    sum = list.get(i) + list.get(j) + list.get(k);
                    if(sum <= M) {
                        if(result < sum) {
                            result = sum;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
