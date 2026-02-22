class Solution {
    public int solution(int[] num_list) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sbb = new StringBuffer();
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                sb.append(num_list[i]);
            } else {
                sbb.append(num_list[i]);
            }
        }
        return Integer.parseInt(sb.toString()) + Integer.parseInt(sbb.toString());
    }
}