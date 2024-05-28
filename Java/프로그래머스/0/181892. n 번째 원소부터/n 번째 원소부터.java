class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] nums = new int[num_list.length - n + 1];
        for(int i = n - 1; i < num_list.length; i++){
            nums[i-n+1] = num_list[i];
        }
        return nums;
    }
}