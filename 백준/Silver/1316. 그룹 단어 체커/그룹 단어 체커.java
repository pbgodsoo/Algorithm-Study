import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<Character> list;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ans = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            list = new ArrayList<>();
            int j = 0;
            while(j < str.length()) {
                if(list.isEmpty()) {
                    list.add(str.charAt(j));
                }else if(list.get(list.size()-1) != str.charAt(j)){
                    if(list.contains(str.charAt(j))) {
                        ans--;
                        break;
                    }
                    list.add(str.charAt(j));
                }
                j++;
            }
            ans++;
        }
        System.out.println(ans);
    }
}
