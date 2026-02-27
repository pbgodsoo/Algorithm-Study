import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = input.length();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) input.charAt(i) - '0';
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
