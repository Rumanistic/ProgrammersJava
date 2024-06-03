class Solution {
    public int solution(int n) {
		int result = 0;
		int j = 0;
		int pow3 = 1;
		
		while(true) {
			if (pow3 > n)
				break;
			else {
				pow3 = (int)(Math.pow(3, j++));
			}
		}
		j -= 1;
		while(n > 1) {
			result += (n%3) * (int)(Math.pow(3, --j));
			n /= 3;
		}
		
		result += n;
		
        return result;
    }
}