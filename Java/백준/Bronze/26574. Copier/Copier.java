import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int copys = sc.nextInt();
        
        for(int i = 0; i < copys; i++){
            int t = sc.nextInt();
            sb.append(String.valueOf(t));
            sb.append(' ');
            sb.append(String.valueOf(t));
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }
}