class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int sleng = spell.length;
        int check = 0;
        for(String a: dic){
            if(a.length() == sleng){
                for(String c: spell){
                    if(a.contains(c)){
                        check++;
                        System.out.print(check);
                    }
                    if(check == sleng){
                        answer = 1;
                        break;
                    }
                }
                check=0;
            }
        }
        return answer;
    }
}