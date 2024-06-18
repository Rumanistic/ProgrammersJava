class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum = 0;
        if(arr1.length != arr2.length){
            return (arr1.length > arr2.length) ? 1 : -1;
        }else{
            for(int i : arr1)
                sum += i;
            for(int i : arr2)
                sum -= i;
            if(sum == 0)
                return 0;
            else if (sum > 0)
                return 1;
            else
                return -1;
        }
    }
}