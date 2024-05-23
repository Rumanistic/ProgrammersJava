class Solution {
    public int[] solution(String my_string) {
        int[] alphabet = new int[52];
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) >= 'a')
                alphabet[((int)(my_string.charAt(i)) % (int)('a'))+26] += 1;
            else
                alphabet[((int)(my_string.charAt(i)) % (int)('A'))] += 1;
                
        }
        
        return alphabet;
    }
}