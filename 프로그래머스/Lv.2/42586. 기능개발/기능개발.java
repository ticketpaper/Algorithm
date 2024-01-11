import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        Deque<Integer> deque = new ArrayDeque<>();
        int temp = 0, count = 1, length = progresses.length;;
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            int remainingProgress = 100 - progresses[i];
            int daysRequired = (int) Math.ceil((double) remainingProgress / speeds[i]);
            deque.add(daysRequired);
        }
        

        temp = deque.pollFirst();
        boolean change = false;
        while (!deque.isEmpty()) {
            if (temp >= deque.peekFirst()) {
                count++;
                deque.pollFirst();
            } else {
                temp = deque.pollFirst();
                answer.add(count);  // 작업이 완료되지 않았더라도 count를 증가시킴
                count = 1;
            }
        }
        answer.add(count);
        return answer;
    }
}