import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}