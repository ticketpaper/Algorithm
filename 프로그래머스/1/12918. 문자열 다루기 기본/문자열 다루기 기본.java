import java.util.regex.Pattern;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        answer = Pattern.matches("[0-9]{4}|[0-9]{6}",s);
        
        return answer;
    }
}