import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] count = new int[26];
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(Character.toUpperCase(str.charAt(i)));
        }
        for (int i = 0; i < list.size(); i++) {
            count[list.get(i)-'A']++;
        }
        int max = 0;
        int maxI = 0;
        for (int i = 0; i < count.length; i++) {
            if(count[i]>max) {
                max = count[i];
                maxI = i;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if(i == maxI) {
                continue;
            }
            else if(count[i] == max) {
                System.out.println("?");
                return;
            }
        }
        System.out.println((char)(maxI+'A'));

    }
}
