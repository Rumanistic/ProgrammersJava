class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
		String[] nums = String.valueOf(n).split("");
		
		for(int i = 0; i < nums.length - 1; i++) {
			int idx = i;
			for(int j = i + 1; j < nums.length; j++) {
				if(Integer.parseInt(nums[j]) > Integer.parseInt(nums[idx]))
					idx = j;
			}
			if(idx != i) {
				String temp = nums[idx];
				nums[idx] = nums[i];
				nums[i] = temp;
			}
		}
        
		for(int i = 0; i < nums.length; i++) {
			sb.append(nums[i]);
		}
        
		return Long.parseLong(sb.toString());
    }
}
/*
       int idx = 0;
		String s = String.valueOf(n);
		// StringBuilder sb = new StringBuilder();
        ArrayList<Character> result = new ArrayList<>();
		
		// sb.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
			idx = 0;
			while(idx < i) {
				if(s.charAt(i) >= sb.charAt(idx)) {
					sb.insert(idx, s.charAt(i));
					break;
				}else {
					idx++;
				}
			}
		}
        for(int i = 0; i < s.length(); i++){
            if(i == 0)
                result.add(s.charAt(i));
            else{
                
            }
            idx++;
        }
		return Long.parseLong(sb.toString());
*/