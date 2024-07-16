import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class Record {
    private String no;
    private int sTime;
    private boolean isIn;
    private int totTime;
    
    Record(String no, int sTime, boolean isIn){
        this.no = no;
        this.sTime = sTime;
        this.isIn = isIn;
        this.totTime = 0;
    }
    
    public int getsTime() {
        return sTime;
    }

    public boolean getIsIn() {
        return isIn;
    }

    public int getTotTime() {
        return totTime;
    }
    
    public void setsTime(int sTime) {
        this.sTime = sTime;
    }

    public void setIsIn(boolean isIn) {
        this.isIn = isIn;
    }
    
    public void setTotTime(int calcTime){
        if(this.totTime != 0){
            totTime += calcTime;
        }
        else{
            totTime = calcTime;
        }
    }
    
    int getTotFee(int defTime, int defFee, int sdtTime, int sdtFee){
        if(this.totTime <= defTime)
            return defFee;
        else {
            if((totTime - defTime) % sdtTime == 0)
                return defFee + sdtFee * ((totTime - defTime) / sdtTime);
            else
                return defFee + sdtFee * ((totTime - defTime) / sdtTime + 1);
        }
    }
}


class Solution {
    public Record newRecord(String[] rec){
        String[] temp = rec[0].split(":");
        int sTime = Integer.parseInt(temp[0])*60 + Integer.parseInt(temp[1]);
        boolean b = rec[2].equals("IN") ? true: false;
        Record r = new Record(rec[1], sTime, b);
        return r;
    }
    
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        Map<String, Record> recordMap = new HashMap<>();
        int defTime = fees[0], 
            defFee = fees[1], 
            sdtTime = fees[2], 
            sdtFee = fees[3];
        
        for(String s : records){
            String[] rec = s.split(" ");
            switch(rec[2]){
                case "IN":
                    if(!recordMap.containsKey(rec[1])){
                        Record r = newRecord(rec);
                        recordMap.put(rec[1], r);
                    }
                    else {
                        String[] temp = rec[0].split(":");
                        int sTime = Integer.parseInt(temp[0])*60 + Integer.parseInt(temp[1]);
                        recordMap.get(rec[1]).setsTime(sTime);
                        recordMap.get(rec[1]).setIsIn(true);
                    }
                    break;
                case "OUT":
                    String[] temp = rec[0].split(":");
                    int eTime = Integer.parseInt(temp[0])*60 + Integer.parseInt(temp[1]);
                    int sTime = recordMap.get(rec[1]).getsTime();
                    recordMap.get(rec[1]).setTotTime(eTime - sTime);
                    recordMap.get(rec[1]).setIsIn(false);
                    break;
            }
        }
        
        List<String> keySet = new ArrayList<>(recordMap.keySet());
        Collections.sort(keySet);
        int len = recordMap.size();
        answer = new int[len];
        int idx = 0;
        
        for(String s : keySet){
            if(recordMap.get(s).getIsIn()){
                int eTime = 23*60 + 59;
                recordMap.get(s).setTotTime(eTime - recordMap.get(s).getsTime());
                int totFee = recordMap.get(s).getTotFee(defTime, defFee, sdtTime, sdtFee);
                answer[idx++] = totFee;
            }
            else{
                int totFee = recordMap.get(s).getTotFee(defTime, defFee, sdtTime, sdtFee);
                answer[idx++] = totFee;
            }
        }
        return answer;
    }
}