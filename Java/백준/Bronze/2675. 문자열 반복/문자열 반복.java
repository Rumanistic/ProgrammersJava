import java.util.Scanner;

class Main{
    public static String repeats(String count, String str){
        int counts = Integer.parseInt(count);
        char c[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < counts; j++)
                sb.append(c[i]);
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counts = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < counts; i++){
            String str[] = sc.nextLine().split(" ");
            String result = repeats(str[0], str[1]);
            System.out.println(result);
        }
    }
}
/*
    2
    3 ABC
    5 /HTP
*/