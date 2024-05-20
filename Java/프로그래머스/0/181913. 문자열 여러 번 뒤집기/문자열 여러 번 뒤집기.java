class Solution {
    public String reverse(String s, int[] i){
        char[] sCharArr = s.toCharArray();
        String result = "";
        char temp = ' ';
        int count = (i[1] - i[0] + 1) % 2;
        
        for(int j = 0; j < (i[1] - i[0] + 1) / 2 ; j++){
            temp = sCharArr[i[0] + j];
            sCharArr[i[0] + j] = sCharArr[i[1] - j];
            sCharArr[i[1] - j] = temp;
        }
        
        for(int j = 0; j < sCharArr.length; j++){
            result += sCharArr[j];
        }
        
        return result;
        // switch(count){
        //     case 1:
        //         for(int j = 0; j < (i[1] - i[0] + 1) / 2 ; j++){
        //             temp = sCharArr[i[0] + j];
        //             sCharArr[i[0] + j] = sCharArr[i[1] - j];
        //         }
        //         break;
        //     case 0:
        //         break;
        // }
    }
    
    public String solution(String my_string, int[][] queries) {
        for(int[] i : queries){
            my_string = reverse(my_string, i);
        }
        return my_string;
    }
}

/*
    abcdefg
    afedcbg
*/