import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        boolean[] visit = new boolean[10];
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        visit[arr[0]] = true;
        for (int i = 1; i < arr.length; i++) {
            if (visit[arr[i]] == false) {
                answer.add(arr[i]);
                visit[arr[i]] = true;
            }
            if (arr[i] != arr[i - 1]) {
                visit[arr[i - 1]] = false;
            }
        }

        return answer;
    }
}