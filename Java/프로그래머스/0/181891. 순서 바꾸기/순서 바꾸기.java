class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] a = new int[num_list.length];
        for(int i = n; i < n + a.length; i++){
            if(i >= a.length){
                a[i - n] = num_list[i%a.length];
            }else{
                a[i-n] = num_list[i];
            }
        }
        return a;
    }
}