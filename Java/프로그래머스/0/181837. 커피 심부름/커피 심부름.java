class Solution {
    public int solution(String[] order) {
        int cost = 0;
        for(String s : order){
            if(s.contains("latte"))
                cost += 5000;
            else
                cost += 4500;
        }
        return cost;
    }
}

/*
    latte > 라떼
    cano > 아메리카노
    any > 아메리카노
*/