import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> phone_set = new HashSet<>(Arrays.asList(phone_book));
        boolean answer = true;

        for (String phoneNumber : phone_book) {
            for (int i =1; i <= phoneNumber.length(); i++) {
                String prefix = phoneNumber.substring(0, i);
                if (phone_set.contains(prefix) && !prefix.equals(phoneNumber)) {
                    answer = false;
                }
            }
        }
        return answer;
    }
}