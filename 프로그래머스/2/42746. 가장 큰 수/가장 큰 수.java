import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        int count = 0;
        String[] arr4 = new String[numbers.length];
        for (Integer i : numbers) {
            arr4[count] = String.valueOf(i);
            count++;
        }

        Arrays.sort(arr4, (o1, o2) -> (o2+o1).compareTo(o1+o2));

        String answer = String.join("",arr4);

        String temp = "";
        for (int i = 0; i < answer.length(); i++) {
            temp += "0";
        }
        if (temp.equals(answer)) {
            answer = "0";
        }
        return answer;
    }
}