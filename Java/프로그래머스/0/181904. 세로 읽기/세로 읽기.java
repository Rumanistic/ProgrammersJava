class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length() / m; i++)
            sb.append(my_string.charAt(c - 1 + i * m));
        
        return sb.toString();
    }
}

/*
    c + nm 번째 문자들만 모으면 된다
*/