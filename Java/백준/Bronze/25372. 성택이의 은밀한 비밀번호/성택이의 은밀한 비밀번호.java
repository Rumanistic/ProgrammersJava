import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i < count; i++){
            String str = br.readLine();
            if(str.length() >= 6 && str.length() <= 9){
                System.out.println("yes");
            }else
                System.out.println("no");
        }
    }
}