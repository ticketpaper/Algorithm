import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> uid_user = new HashMap<>();
        List<String> uid = new ArrayList<>();
        List<String> order = new ArrayList<>();
        for (String s : record) {
            String[] s1 = s.split(" ");
            if (!s1[0].equals("Change")) {
                order.add(s1[0]);
                uid.add(s1[1]);
            }
            if (!s1[0].equals("Leave")) {
                uid_user.put(s1[1], s1[2]);
            }
        }
        String[] answer = new String[order.size()];
        for (int i = 0; i < answer.length; i++) {
            if (order.get(i).equals("Enter")) {
                answer[i] = (uid_user.get(uid.get(i)) + "님이 들어왔습니다.");
            } else if (order.get(i).equals("Leave")) {
                answer[i] = (uid_user.get(uid.get(i))+"님이 나갔습니다.");
            }
        }

        return answer;
    }
}