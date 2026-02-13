import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <2 ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max0 = -10000;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0] > max0) {
                max0 = arr[i][0];
            }
        }
        int min0 = 10000;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0] < min0) {
                min0 = arr[i][0];
            }
        }
        int max1 = -10000;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][1] > max1) {
                max1 = arr[i][1];
            }
        }
        int min1 = 10000;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][1] < min1) {
                min1 = arr[i][1];
            }
        }
        System.out.println((max0-min0) * (max1-min1));
    }
}
