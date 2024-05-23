class Solution {
    public int solution(String str, String prefix) {
        if(str.startsWith(prefix))
            return 1;
        else
            return 0;
    }
}