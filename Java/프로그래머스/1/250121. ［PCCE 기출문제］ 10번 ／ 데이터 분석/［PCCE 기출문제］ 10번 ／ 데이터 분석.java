import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] query(int[][] data, String ext, int val){
        List<Integer> list = new ArrayList<>();
        int[] result = {};
        int count = 0;
        
        switch(ext) {
            case "code":
                for (int i = 0; i < data.length; i++) {
                    if (data[i][0] < val) {
                        list.add(i);
                        count++;
                    }
                }
                break;
            case "date":
                for (int i = 0; i < data.length; i++) {
                    if (data[i][1] < val) {
                        list.add(i);
                        count++;
                    }
                }
                break;
            case "maximum":
                for (int i = 0; i < data.length; i++) {
                    if (data[i][2] < val) {
                        list.add(i);
                        count++;
                    }
                }
                break;
            case "remain":
                for (int i = 0; i < data.length; i++) {
                    if (data[i][3] < val) {
                        list.add(i);
                        count++;
                    }
                }
                break;
        }
        
        result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
    
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[] result = query(data, ext, val_ext);
        int[][] answer = new int[result.length][data[0].length];

        int sortBy = 0;
        switch(sort_by){
            case "code":
                sortBy = 0;
                break;
            case "date":
                sortBy = 1;
                break;
            case "maximum":
                sortBy = 2;
                break;
            case "remain":
                sortBy = 3;
                break;
        }
        
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (data[result[j]][sortBy] > data[result[j+1]][sortBy]) {
                    int temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;
                }
            }
        }
        
        for(int i = 0; i < result.length; i++){
            answer[i] = data[result[i]];
        }
        
        return answer;
    }
}
/*

*/