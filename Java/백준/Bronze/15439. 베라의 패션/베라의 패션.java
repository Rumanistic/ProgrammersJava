import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int colors = sc.nextInt();
        System.out.println(colors * (colors -1));
    }
}