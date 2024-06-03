class Solution {
    public int[][] rotate(int[][] sizes){
        int temp = 0;
        for(int i =0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        return sizes;
    }
    
    public int getMax(int[][] sizes, int idx) {
        int temp = 0;
        for(int[] card : sizes){
            if(temp < card[idx])
                temp = card[idx];
        }
        return temp;
    }
    
    public int solution(int[][] sizes) {
        int[][] card = rotate(sizes);
        return getMax(card, 0) * getMax(card, 1);
    }
}