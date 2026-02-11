import java.util.Stack;

class Solution {
    public int solution(int n, int[][] computers) {
        int result = 0;

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> resultStack = new Stack<>();
        char[] visited = new char[n];

        for (int i = 0; i < visited.length; i++) {
            visited[i] = 'f';
        }

        boolean allT = false;
        int insert =0;
        while (!allT) {
            allT = true;
            for (int i = 0; i < visited.length; i++) {
                if (visited[i] != 't') {
                    allT = false;
                    insert = i;
                    break;
                }
            }
            stack.add(insert);
            resultStack.add(insert);
            visited[insert] = 't';
            while (!stack.empty()) {
                int num = stack.pop();
                for (int i = 0; i < n; i++) {
                    if (computers[num][i] == 1 && visited[i] == 'f') {
                        stack.add(num);
                        stack.add(i);
                        resultStack.add(i);
                        visited[i] = 't';
                        break;
                    }
                }
            }
            result++;
            allT = true;
            for (int i = 0; i < visited.length; i++) {
                if (visited[i] != 't') {
                    allT = false;
                    break;
                }
            }
        }
        return result;
    }
}