import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
       int pcount = 1;
        String[] answer = new String[players.length];
        Map<String, Integer> p_map = new LinkedHashMap<>();
        Map<Integer, String> rev_map = new LinkedHashMap<>();
        for (String s : players) {
            p_map.put(s, pcount);
            rev_map.put(pcount, s);
            pcount++;
        }
        for (String call : callings) {
            String s_temp= "";
            Integer i_temp = 0;

            i_temp = p_map.get(call)-1; // call 앞에 있는 선수 등수
            s_temp = rev_map.get(p_map.get(call)-1); // call 앞에 있는 선수 이름
            p_map.put(call, p_map.get(call) - 1);
            p_map.put(s_temp, i_temp + 1);
            rev_map.put(p_map.get(call), call);
            // 불러진 선수의 변경된 값 넣기
            rev_map.put(i_temp+1, s_temp);
            // 불려진 선수의 앞에 있는애 순위 조절
        }
        int index = 0;
        for (String value : rev_map.values()) {
            answer[index]=value;
            index++;
        }
        return answer;
    }
}