import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static class Row {
        int num;
        String str;

        public Row(int num, String str) {
            this.num = num;
            this.str = str;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        List<Row> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Row(Integer.parseInt(st.nextToken()), st.nextToken()));
        }
        list.sort((a, b) -> a.num - b.num);
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i).num + " " + list.get(i).str);
        }
    }
}
