import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        ArrayList<int[]> file = new ArrayList<>();
        int[] drag = { wallpaper.length-1, wallpaper[0].length()-1, 0, 0};
        int idx = 0;
        
        for (String s : wallpaper){
            if (s.contains("#")) {
                if(s.indexOf("#") == s.lastIndexOf("#")) {
                    // #가 라인에 하나 있을 때
                    int[] pound = new int[2];
                    pound[0] = idx;
                    pound[1] = s.indexOf("#");
                    file.add(pound);
                    System.out.println(Arrays.toString(pound));
                }else {
                    // #가 라인에 두개 이상 있을 때
                    int[] pounds = new int[2];
                    pounds[0] = idx;
                    pounds[1] = s.indexOf("#");
                    file.add(pounds);
                    int[] pounde = new int[2];
                    pounde[0] = idx;
                    pounde[1] = s.lastIndexOf("#");
                    file.add(pounde);
                    System.out.println(Arrays.toString(pounds));
                    System.out.println(Arrays.toString(pounde));
                }			
            }
            idx++;
        }
        
        System.out.println(Arrays.toString(drag));
        if(file.isEmpty() != true){
            for (int i = 0; i < file.size(); i++) {
                int[] current = file.get(i);
                if (drag[0] > current[0]){
                    drag[0] = current[0];
                }
                if (drag[1] > current[1]){
                    drag[1] = current[1];
                }
                if (drag[2] < current[0]){
                    drag[2] = current[0];
                }
                if (drag[3] < current[1]){
                    drag[3] = current[1];
                }
            }
            drag[2] +=1;
            drag[3] +=1;
        }else{
            drag[0] = 0;
            drag[1] = 0;
            drag[2] = 0;
            drag[3] = 0;
        }

        System.out.println(Arrays.toString(drag));
        return drag; 
    }
}

/*
입력값 〉 [".....", "....#"]
기댓값 〉 [1, 4, 2, 5]
*/
