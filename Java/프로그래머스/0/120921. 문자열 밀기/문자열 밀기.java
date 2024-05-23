class Solution {
    public int solution(String a, String b) {
        int answer = 0;
        for(int i = a.length() - 1; i >=0; i--){
            if(a.equals(b)){
                answer = 0;
                break;
            }
            else if(b.endsWith(a.substring(0,i)) && b.startsWith(a.substring(i,a.length()))){
                answer = a.length() - i;
                break;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}
/*
for int i = 0; i < A.length(); i++
    if  b.contain (a.substr) && b.contain(a.substr(a.len - i))
        ans = i
    else -1
    
if i >= a.len / 2
    //cdeab(-2) bcdea(-1) abcde(원본) eabcd(+1) deabc(+2) cdeab(+3 == -2)

return i

a와 b를 비교
    같으면 0
a를 >> 와 b를 비교(contains)
    
*/