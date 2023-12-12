import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            if (map.containsKey(p)) {
                map.put(p, map.get(p)+1);
            } else {
                map.put(p, 1);
            }
        }
        for (String s : completion) {
            if (map.get(s) == 1) {
                map.remove(s);
            } else {
                map.put(s, map.get(s)-1);
            }
        }

        String answer = "";
        for (String s : map.keySet()) {
            answer += s;
        }
        return answer;
    }
}