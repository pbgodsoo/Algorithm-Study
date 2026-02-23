import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> list = new ArrayList<>();
        final int j =
            sort_by.equals("code") ? 0 :
            sort_by.equals("date") ? 1 :
            sort_by.equals("maximum") ? 2 : 3;
        if(ext.equals("date")) {
            for(int i = 0; i < data.length; i++) {
                if(data[i][1] < val_ext) {
                    list.add(data[i]);
                }
            }
        } else if (ext.equals("code")) {
            for(int i = 0; i < data.length; i++) {
                if(data[i][0] < val_ext) {
                    list.add(data[i]);
                }
            }
        } else if (ext.equals("maximum")) {
            for(int i = 0; i < data.length; i++) {
                if(data[i][2] < val_ext) {
                    list.add(data[i]);
                }
            }
        } else {
            for(int i = 0; i < data.length; i++) {
                if(data[i][3] < val_ext) {
                    list.add(data[i]);
                }
            }
        }
        Collections.sort(list, (a, b) -> a[j] - b[j]);
        int[][] answer = new int[list.size()][4];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}