class Solution {
    public String solution(String s) {
        int idx = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				idx = 0;
				sb.append(s.charAt(i));
			}else {
				if (idx % 2 == 0) {
					sb.append(Character.toString(s.charAt(i)).toUpperCase());
					idx++;
				}else {
					sb.append(Character.toString(s.charAt(i)).toLowerCase());
					idx++;
				}
			}
		}
        return sb.toString();
    }
}