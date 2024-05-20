class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int MAXTIME = attacks[attacks.length - 1][0];
        int goal = bandage[0];
        int nextHealth = health;
        int temp = 0;
        int state = 0;
        boolean attx = false;
        
        int[] attTime = new int[attacks.length];
        int attIdx = 0;
        
        for (int i = 0; i < attacks.length; i++)
            attTime[i] = attacks[i][0];
        System.out.println(attTime[attacks.length-1]);

        
        bandage : for (int i = 0; i <= MAXTIME; i++){
            if(i == attTime[attIdx]){   // 공격받을 경우
                attx = true;
                nextHealth -= attacks[attIdx][1];
                temp = 0;
                if (nextHealth <= 0){
                    state = -1;
                }
                attIdx++;
            }else{  // 공격받지 않을 경우
                attx = false;
                if(goal - temp == 0){
                    if(nextHealth + bandage[2] < health)
                        nextHealth += bandage[2];
                    else
                        nextHealth = health;
                    temp = 0;
                }

                if(nextHealth + bandage[1] < health)
                        nextHealth += bandage[1];
                else
                    nextHealth = health;
            }


            System.out.print(i + " | " + nextHealth + " | " + temp + " | " + attx);
            System.out.println();
            
            if(state == -1)
                break;
            temp++;
        }
        if (state != -1)
            state = nextHealth;
        return state;
    }
}