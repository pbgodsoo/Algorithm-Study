import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정수 입력 받기 (문자열로 읽어서 숫자로 변환)
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();

            // 첫 글자와 마지막 글자 추출
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);

            System.out.println("" + first + last);
        }
    }
}
