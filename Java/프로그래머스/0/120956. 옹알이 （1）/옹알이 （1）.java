class Solution {
    int count = 0;
    public void word(String babblings){
        if(babblings.startsWith("aya")){
            if(babblings.equals("aya")){
                count++;
                return;
            }
            word(babblings.substring(3));
        }
        if(babblings.startsWith("ye")){
            if(babblings.equals("ye")){
                count++;
                return;
            }
            word(babblings.substring(2));
        }
        if(babblings.startsWith("woo")){
            if(babblings.equals("woo")){
                count++;
                return;
            }
            word(babblings.substring(3));
        }
        if(babblings.startsWith("ma")){
            if(babblings.equals("ma")){
                count++;
                return;
            }
            word(babblings.substring(2));
        }
    }
    
    public int solution(String[] babbling) {
        for(String s : babbling){
            word(s);
            System.out.println();
        }
        return count;
    }
}


        // switch(babblings.charAt(0)){
        //     case 'a':
        //         System.out.print("AYA");
        //         if(babblings.contains("aya")){
        //             if(babblings.substring(3).equals(""))
        //                 count++;
        //             else{
        //                 word(babblings.substring(3));
        //             }
        //         }
        //         break;
        //     case 'y':
        //         System.out.print("YE");
        //         if(babblings.contains("ye")){
        //             if(babblings.substring(2).equals(""))
        //                 count++;
        //             else{
        //                 word(babblings.substring(2));
        //             }
        //         }
        //         break;
        //     case 'w':
        //         System.out.print("WOO");
        //         if(babblings.contains("woo")){
        //             if(babblings.substring(3).equals(""))
        //                 count++;
        //             else{
        //                 word(babblings.substring(3));
        //             }
        //         }
        //         break;
        //     case 'm':
        //         System.out.print("MA");
        //         if(babblings.contains("ma")){
        //             if(babblings.substring(2).equals(""))
        //                 count++;
        //             else{
        //                 word(babblings.substring(2));
        //             }
        //         }
        //         break;
        //     default:
        //         break;
        // }