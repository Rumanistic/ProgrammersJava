import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] judge = br.readLine().split(" ");
        int lv = Integer.parseInt(judge[0]);
        
        switch(judge[1]){
            case "miss":
                System.out.println(lv * 0);
                break;
            case "bad":
                System.out.println(lv * 200);
                break;
            case "cool":
                System.out.println(lv * 400);
                break;
            case "great":
                System.out.println(lv * 600);
                break;
            case "perfect":
                System.out.println(lv * 1000);
                break;
        }
    }
}