import java.util.*;

class Solution {
    public ArrayList<Integer> numArr(ArrayList<Integer> iArr, int[] idxs, int[] arr) {
        for(int i = idxs[0]; i <= idxs[1]; i++){
            iArr.add(arr[i]);
        }
        return iArr;
    }
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int[] i : intervals){
            numArr(result, i, arr);
        }
        
        return result;
    }
}