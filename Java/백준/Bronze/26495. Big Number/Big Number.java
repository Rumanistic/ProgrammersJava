import java.io.*;

class Main{
    public static void printNum(int num, boolean[][] chars, int[][] numRow){
        for(int i = 0; i < 5; i++){
            if(numRow[num][i] == 1){
                System.out.print(num);
            }
            else{
                for(int j = 0; j < 4; j++){
                    if(chars[numRow[num][i]][j])
                        System.out.print(num);
                    else
                        System.out.print(" ");
                }   
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) throws Exception{
        boolean[][] chars = {{false, false, false, true}
                             ,{true, false, false, false}
                             ,{true, false, false, true}
                             ,{true, true, true, true}};
        
        int[][] numRow = {{3,2,2,2,3}
                          ,{0,0,0,0,0}
                          ,{3,0,3,1,3}
                          ,{3,0,3,0,3}
                          ,{2,2,3,0,0}
                          ,{3,1,3,0,3}
                          ,{3,1,3,2,3}
                          ,{3,0,0,0,0}
                          ,{3,2,3,2,3}
                          ,{3,2,3,0,0}};
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bigN = br.readLine();
        for(String s : bigN.split("")){
            int i = Integer.parseInt(s);
            printNum(i, chars, numRow);
            System.out.println();
        }
    }
}