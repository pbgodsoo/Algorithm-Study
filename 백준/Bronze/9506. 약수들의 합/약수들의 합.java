import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list;
        while (true) {
            int a = Integer.parseInt(br.readLine());
            int b = 0;
            list = new ArrayList<>();

            if (a == -1) break;
            for (int i = 1; i <= a; i++) {
                if(a % i == 0) {
                    if(i != a) {
                        list.add(i);
                        b += i;
                    }
                }
            }
            if (a == b) {
                System.out.print(a + " = ");
                int size = list.size()-1;
                for(int i : list){
                    System.out.print(i);
                    if(size > 0) {
                        System.out.print(" + ");
                        size--;
                    }
                }
                System.out.println();
            } else {
                System.out.println(a + " is NOT perfect.");
            }
        }
    }
}
