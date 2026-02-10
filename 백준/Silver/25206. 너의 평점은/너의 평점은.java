import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double a = 0;
        double b = 0;
        ArrayList<String> list = new ArrayList<>();

        double[][] arr = new double[2][20];
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(st.nextToken());
            String aa = st.nextToken();
            String bb = st.nextToken();
            if(!bb.equals("P")) {
                arr[0][i] = Double.parseDouble(aa);
                arr[1][i] = grade(bb);
            } else {
                arr[0][i] = 0;
                arr[1][i] = 0;
            }
        }

        for (int i = 0; i < 20; i++) {
            double c;
            a += arr[0][i];
            c = arr[0][i] * arr[1][i];
            b += c;
        }

        System.out.printf("%.6f", b / a);
    }

    public static double grade(String str) {
        double grade = 0;
        switch (str) {
            case "A+":
                grade = 4.5;
                break;
            case "A0":
                grade = 4;
                break;
            case "B+":
                grade = 3.5;
                break;
            case "B0":
                grade = 3;
                break;
            case "C+":
                grade = 2.5;
                break;
            case "C0":
                grade = 2;
                break;
            case "D+":
                grade = 1.5;
                break;
            case "D0":
                grade = 1;
                break;
            case "F":
                grade = 0;
                break;
        }
        return grade;
    }
}
