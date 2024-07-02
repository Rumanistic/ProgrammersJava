class Solution {
    public int minNum(int[] arr){
        int temp = arr[0];
        
        for(int i : arr){
            if(temp > i)
                temp = i;
        }
        
        return temp;
    }
    public int[] solution(int[] arr) {
        int[] one = {-1};
        
        if(arr.length == 1)
            return one;
        
        one = new int[arr.length - 1];
        int del = minNum(arr);
        int idx = 0;
        
        for(int i : arr){
            if(i == del)
                continue;
            
            one[idx++] = i;
        }
        
        return one;
    }
}