
class Solution {
    public String solution(String code) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if(ch !='1') {
                if(mode == 0) {
                    if(i % 2 == 0) {
                        // 짝수 일 때
                        sb.append(ch);
                    }
                } else {
                    if(i % 2 != 0) {
                        // 홀수 일 때
                        sb.append(ch);
                    }
                }
            } else {
                if (mode == 0) {
                    mode = 1;
                } else {
                    mode = 0;
                }
            }
        }
        if(sb.length() == 0) {
            answer = "EMPTY";
        } else {
            answer = sb.toString();
        }
        return answer;
    }
}