class Solution {
    public int nSum(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            sum += i;
        }
        return sum;
    }
    
    public int[] setN(int nums, int sNum){
        int[] numSet = new int[nums];
        for(int i = 0; i < numSet.length; i++){
            numSet[i] = sNum++;
        }
        return numSet;
    }
    
    public int[] solution(int num, int total) {
        int sNum = (total - nSum(num))/num;
        return setN(num, sNum);
    }
}

/*
    num % 2 == 1;
    case 3:
        x x+1 x+2 >> 3x + 3; x = (total-3)/3
    case 4:
        x x+1 x+2 x+3 >> 4x + 6; x = (total-6)/4
    case 5:
        x x+1 x+2 x+3 x+4 >> 5x + 10; x = (total-10)/5
    ...
    case n:
        (total - (n-1)Sum)/n
*/