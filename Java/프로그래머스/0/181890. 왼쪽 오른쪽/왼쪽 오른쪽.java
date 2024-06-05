import java.util.Arrays;

class Solution {
    String[] result;
    public String[] solution(String[] str_list) {
        int stopIdx = 0;
        
        for(String s : str_list){
            if(s.equals("l") || s.equals("r"))
                break;
            stopIdx++;
        }
        if(stopIdx == str_list.length){
            result = new String[0];
        }else{
            switch(str_list[stopIdx]){
            case "l":
                try{
                    result = Arrays.copyOf(str_list, stopIdx);
                }catch (Exception e){
                    result = new String[0];
                }
                break;
            case "r":
                try{
                    result = Arrays.copyOfRange(str_list, stopIdx + 1, str_list.length);
                }catch (Exception e){
                    result = new String[0];
                }
                break;
            default:
                result = str_list;
        }
            
        }
        
        return result;
    }
}
/*
u d l r 4개만 주어짐
l을 만날 경우, l의 왼쪽에 있는 문자열 리턴
r을 만날 경우, r의 오른쪽에 있는 문자열 리턴

case : l을 처음 만날 경우
	l - 1 까지 리턴
case : r을 처음 만날 경우
	r + 1부터~
	case : l이 포함되어 있을 경우
		r + 1부터 l - 1까지 리턴
	case : l이 포함되어 있지 않을 경우
		r + 1부터 리턴
        
        
        public String[] set(String[] result, int idx, String[] strList){
            for(int i = 0; i < result.length; i++){
                result[i] = strList[idx++];
            }
            return result;
        }
        
        String[] result = {};
        for(int i = 0; i < str_list.length; i++){
            switch(str_list[i]){
                case "l":
                    result = new String[i];
                    result = set(result, i - 1, str_list);
                    break;
                case "r":
                    if(str_list.lastIndexOf("l", i+1) > i){
                        result = new String[str_list.lastIndexOf("l", i+1) - i + 1];
                        set(result, i + 1, str_list);
                    } else {
                        result = new String[str_list.length - i - 1];
                        result = set(result, i + 1, str_list);
                    }
                    break;
                default:
                    break;
            }
        }
        return result;
        ************************************************
        int idx = 0;
        int lPos = -1;
        int rPos = -1;
        boolean flag = true;
        String[] str = {};
        
        while(flag){
            if(str_list[idx].equals("l")){
                lPos = idx;
                flag = !flag;
            }
            if(str_list[idx].equals("r")){
                rPos = idx;
                flag = !flag;
            }
            if(idx >= str_list.length){
                lPos = -1;
                rPos = -1;
                flag = !flag;
            }
            idx++;
        }
        
        if(rPos >= str_list.length - 1 && lPos == 0 && rPos == lPos -1){
            
        }
        return str;
        *************************************
        StringBuilder sb = new StringBuilder();
        String[] result = new String[0];
        
        for(String s : str_list){
            sb.append(s);
        }
        
        String str = sb.toString();
        int lIdx = str.indexOf("l");
        int rIdx = str.indexOf("r");
        if(lIdx != -1 && lIdx < rIdx){
            if(lIdx == 0){}
            else{
                result = new String[lIdx];
                for(int i = 0; i < lIdx; i++){
                    result[i] = str_list[i];
                }
            }
        }else if(rIdx != -1 && rIdx < lIdx){
            if(rIdx == str_list.length - 1){}
            else{
                result = new String[str_list.length - rIdx - 1];
                for(int i = 0; i < result.length; i++){
                    result[i] = str_list[rIdx + i + 1];
                }
            }
        }
 */
