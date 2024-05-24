class Solution {
    public int[] solution(int n, int[] slicer, int[] numList) {
        int[] ans = {};
        int idx = 0;
        try{
            switch(n){
                case 1:
                    ans = new int[slicer[1] + 1];
                    for(int i = 0; i < slicer[1] + 1; i++){
                        ans[idx++] = numList[i];
                    }
                    break;
                case 2:
                	ans = new int[numList.length - slicer[0]];
                	for(int i = slicer[0]; i < numList.length; i++) {
                		ans[idx++] = numList[i];
                	}
                    break;
                case 3:
                    ans = new int[slicer[1] - slicer[0] + 1];
                    for(int i = slicer[0]; i <= slicer[1]; i++){
                        ans[idx++] = numList[i];
                    }
                    break;
                case 4:
                	ans = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
                	for(int i = slicer[0]; i <= slicer[1]; i += slicer[2]){
                        ans[idx++] = numList[i];
                    }
                    break;
	            }
        }catch(Exception e){
            
        }
        return ans;
    }
}
/*
switch(n)
case 1
    0 - slicer[1]
case 2
    slicer[0] - numlist.length
case 3
    slicer[0] - slicer[1]
case 4
2에서부터 6까지 2 간격으로 한다면
    for(slicer[0]; slicer[1]; += slicer[2])
*/