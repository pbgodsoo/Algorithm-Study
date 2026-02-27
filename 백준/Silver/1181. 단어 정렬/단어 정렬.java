import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        String temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i].length() > arr[j].length()) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if (arr[i].length() == arr[j].length()) {
                    if(arr[i].compareTo(arr[j]) > 0) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(i+1 < n && (arr[i].equals(arr[i+1]))) continue;
            System.out.println(arr[i]);
        }
    }
}
