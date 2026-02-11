import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        int i = 2;
        while(N > 1) {
            if(N % i == 0) {
                N /= i;
                list.add(i);
                i = 2;
            } else{
                i++;
            }
        }

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}
