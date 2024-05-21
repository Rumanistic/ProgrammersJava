import java.util.*;

class Solution {
    int gcf = 0;
    int cMult = 0;
    ArrayList<Integer> cf = new ArrayList<>();
    
    public void commonFactors(int num){
        int temp = 1;
        for(int i = 1; i <= num; i++){
            if (num % i == 0){
                if(i >= temp)
                    temp = i;
                cf.add(temp);
            }
        }
    }
    
    public int greatCommonFactors(int num, ArrayList<Integer> cf){
        int temp = 1;
        for(int i = 1; i < cf.size(); i++){
            if (num % cf.get(i) == 0){
                if(cf.get(i) >= temp)
                    temp = cf.get(i);
            }
        }
        return temp;
    }
    
    public int commonMultiply(int n, int m, int gcf){
        return n * (m / gcf);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(n > m){
            commonFactors(m);
            answer[0] = greatCommonFactors(n, cf);
        }else{
            commonFactors(n);
            answer[0] = greatCommonFactors(m, cf);
        }
        
        answer[1] = commonMultiply(n, m, answer[0]);
        
        return answer;
    }
}
/*
    약수 : 1과 자기 자신 이외에 나눠서 나머지가 0이 되는 수
    so 가장 작은 수 2로 나눴을 때가 가장 큰 약수가 되기 때문에
    n/2까지만 반복
    
    공약수 : 두 수 중 작은 쪽의 약수가 큰 수의 약수가 되는 값들
    
    최대공약수: 공약수 중 가장 큰 값
    
    최소공배수 : 두 수를 최대공약수로 나누고
    작은 수에 큰 수의 몫을 곱하거나 큰 수에 작은 수의 몫을 곱하면 계산 가능
*/