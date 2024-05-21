class Solution {
    public int solution(int n) {
        int f0 = 0;
		int f1 = 1;
		
		for(int i = 1; i < n; i++) {
			int temp = f0 + f1;
			f0 = f1;
			f1 = temp % 1234567;
		}
        return f1;
    }
}