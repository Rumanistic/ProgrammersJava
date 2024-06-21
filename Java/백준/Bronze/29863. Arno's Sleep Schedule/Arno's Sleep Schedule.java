import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sTime = Integer.parseInt(br.readLine());
        int eTime = Integer.parseInt(br.readLine());
        
        if(sTime >= 20)
            System.out.println(24 - sTime + eTime);
        else
            System.out.println(eTime - sTime);
    }
}