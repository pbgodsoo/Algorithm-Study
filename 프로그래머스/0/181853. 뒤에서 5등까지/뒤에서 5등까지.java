class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int temp = 100;
        for(int i=0; i< num_list.length; i++) {
            for (int j=0;  j<num_list.length-i-1; j++) {
                if (num_list[j] > num_list[j+1]) {
                    temp = num_list[j];
                    num_list[j] = num_list[j+1];
                    num_list[j+1] = temp;
                }
            }
        }
        for(int i=0; i<5; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}