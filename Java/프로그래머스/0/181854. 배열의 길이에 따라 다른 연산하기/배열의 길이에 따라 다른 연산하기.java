class Solution {
    public int[] solution(int[] arr, int n) {
        switch(arr.length%2){
            case 0:
                for(int i = 0; i < arr.length; i++){
                    if(i%2 == 1)
                        arr[i] += n;
                }
                break;
            case 1:
                for(int i = 0; i < arr.length; i++){
                    if(i%2 == 0)
                        arr[i] += n;
                }
                break;
        }
        return arr;
    }
}