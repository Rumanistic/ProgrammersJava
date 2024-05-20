class Solution {
    public static int[] solution(int n, String[] words) {
		String[] cWords = new String[words.length];
		int turn = 1;
		int[] result = new int[2];
		cWords[0] = words[0];
        int condition = 0;
        
		conclude : for (int i = 1; i < words.length; i++) {
			++turn;
            cWords[i] = words[i];
            System.out.println(words[i] + " | " + cWords[i]);
			for (int j = 0; j < i; j++) {
				if(words[i].equals(cWords[j])){
                    condition = 1;
					break conclude;
                }
			}
			if (cWords[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)) {
                condition = 2;
				break;
			}
            condition = 0;
		}
        
        switch(condition){
            case 1:
            case 2:
                if(turn / n < 1) {
                    result[0] = turn % n == 0? n : turn % n;
                    result[1] = 1;
                }else if(turn / n >= 1) {
                    result[0] = (turn % n == 0)? n : turn % n;
                    result[1] = turn % n == 0? turn / n : turn / n + 1;
                }
                break;
            case 0:
                result[0] = 0;
                result[1] = 0;
        }

        System.out.print(turn + " | " + condition);
        return result;
	}
}