import java.util.Scanner;

class Main{
    public static int digitSum(String s, int counts){
        char[] digit = s.toCharArray();
        int result = 0;
        
        for(int i = 0; i < counts; i++){
            result += (digit[i] - '0');
        }
        
        return result;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counts = sc.nextInt();
        sc.nextLine();
        
        String s = sc.nextLine();
        System.out.println(digitSum(s, counts));
    }
}