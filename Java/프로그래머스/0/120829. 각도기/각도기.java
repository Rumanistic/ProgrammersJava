class Solution {
    public int solution(int angle) {
        int i = 0;
        switch(angle/90){
            case 0:
                i = 1;
                break;
            case 1:
                if(angle == 90)
                    i = 2;
                else
                    i = 3;
                break;
            case 2:
                i = 4;
                break;
        }
        return i;
    }
}