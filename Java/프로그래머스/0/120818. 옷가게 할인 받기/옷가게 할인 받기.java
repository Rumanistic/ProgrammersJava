class Solution {
    public int solution(int price) {
        switch(price / 100000){
            case 0:
                break;
            case 1:
            case 2:
                price *= 0.95;
                break;
            case 3:
            case 4:
                price *= 0.9;
                break;
            default:
                price *= 0.8;
                break;
        }
        return price;
    }
}