import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counts = sc.nextInt();
        int max = 0, min = 0;
        
        for(int i = 0; i < counts; i++){
            if(i == 0){
                int n = sc.nextInt();
                max = n;
                min = n;
                continue;
            }
            
            int n = sc.nextInt();
                
            if(n > max)
                max = n;

            if(n < min)
                min = n;
        }
        
        StringBuilder sb = new StringBuilder();
        System.out.println((sb.append(min).append(' ').append(max)).toString());
    }
}