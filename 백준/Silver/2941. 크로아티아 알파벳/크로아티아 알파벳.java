import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = str.length();
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == 'c') {
                if(str.charAt(i+1) == '=') result--;
                else if (str.charAt(i+1) == '-') {
                    result--;
                }
            } else if (str.charAt(i) == 'd') {
                if (str.charAt(i + 1) == 'z' && i < str.length() - 2) {
                    if(str.charAt(i+2) == '=') result--;
                } else if (str.charAt(i+1) == '-') {
                    result--;
                }
            } else if (str.charAt(i) == 'l') {
                if(str.charAt(i+1) == 'j') result--;
            } else if (str.charAt(i) == 'n') {
                if (str.charAt(i+1) == 'j') result--;
            } else if (str.charAt(i) == 's') {
                if (str.charAt(i+1) == '=') result--;
            } else if (str.charAt(i) == 'z') {
                if (str.charAt(i+1) == '=') result--;
            }
        }
        System.out.println(result);
    }
}
