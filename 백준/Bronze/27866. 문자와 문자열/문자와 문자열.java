import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();   // 문자열
        int i = Integer.parseInt(br.readLine()); // 위치 (1부터 시작)

        // i번째 문자 → 인덱스는 i-1
        System.out.println(S.charAt(i - 1));
    }
}
