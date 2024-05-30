class Solution {
    public int solution(int n) {
        // int resNum = 0;
        // if (n % 2 == 0) {
        //     for (int i = 2; i <= n; i += 2){
        //         resNum += (int)(Math.pow(i, 2));
        //     }
        // } else {
        //     for (int j = 1; j <= n; j += 2){
        //         resNum += j;
        //     }
        // }
        boolean isEven = (n%2 == 0);
        int even = 0;
        int odd = 0;
        for(int i = 1; i <= n; i++){
            if(i%2 == 0)
                even += i * i;
            else
                odd += i;
        }
        return isEven? even : odd;
    }
}