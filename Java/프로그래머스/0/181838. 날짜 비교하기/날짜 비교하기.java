// import java.util.*;
// import java.text.*;

class Solution {
    public int solution(int[] d1, int[] d2) {
        return d1[0] <= d2[0] ? (d1[0] == d1[0] ? (d1[1] <= d2[1] ? (d1[1] == d2[1] ? (d1[2] <= d2[2] ? (d1[2] == d2[2] ? 0: 1) : 0) : 1) : 0) : 1) : 0;
        
    }
}
/*
    public int solution(int[] date1, int[] date2) {
        StringBuilder sbA = new StringBuilder();
        StringBuilder sbB = new StringBuilder();
        String dateA = "";
        String dateB = "";
        int result = 0;
        
        dateA = sbA.append(date1[0]).append("-" + date1[1]).append("-" + date1[2]).toString();
        dateB = sbB.append(date2[0]).append("-" + date2[1]).append("-" + date2[2]).toString();
        
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if(sdf.parse(dateA).before(sdf.parse(dateB)))
                result = 1;
            else
                result = 0;
        }catch (Exception e){
            
        }
        
        return result;
*/