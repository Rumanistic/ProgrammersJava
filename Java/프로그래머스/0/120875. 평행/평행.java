import java.util.ArrayList;
import java.util.List;

class Solution {
    public int isParallel(int[] line1, int[] line2, int[][] dots){
        int x1 = dots[line1[0]][0]; int y1 = dots[line1[0]][1];
        int x2 = dots[line1[1]][0]; int y2 = dots[line1[1]][1];
        int x3 = dots[line2[0]][0]; int y3 = dots[line2[0]][1];
        int x4 = dots[line2[1]][0]; int y4 = dots[line2[1]][1];
        
        if(x1==x2 && x3==x4 && x1!=x3)
            return 1;
        
        if(y1==y2 && y3==y4 && y1!=y3)
            return 1;
        
        if(Math.abs(y2-y1) * Math.abs(x4-x3)  == Math.abs(y4-y3) * Math.abs(x2-x1))
            return 1;
        
        return 0;
    }
    
    public int solution(int[][] dots) {
        int answer = 0;
        int[][] lineA = {{0,1}, {2,3}};
        int[][] lineB = {{0,2}, {1,3}};
        int[][] lineC = {{0,3}, {1,2}};
        
        List<int[][]> lines = new ArrayList<>();
        lines.add(lineA);
        lines.add(lineB);
        lines.add(lineC);
        
        for(int[][] line : lines){
            if(isParallel(line[0], line[1], dots) == 1){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}

/*
    dots의 길이는 4로 고정,
    이어야 하는 선분은 점을 2개 고정으로 필요
    즉, 
    [1,2], [3,4]
    [1,3], [2,4]
    [1,4], [2,3]
    3가지 경우밖에 없음.
    
    두 선이 평행임을 증명하기 위해선
    선분 A와 B의 증감값이 같으면 된다
    (Ax2-Ax1 == Bx2-Bx1 && Ay2-Ay1 == By2-By1);
    위의 조건을 만족하면 1, 만족하지 못하면 0을 리턴한다
*/