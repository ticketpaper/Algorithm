import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> mix = new PriorityQueue<>();
        for (int i : scoville) {
            mix.add(i);
        }
        while(true){
            if (mix.size() == 1) {
                answer = -1;
                break;
            }
            if (mix.peek() >= K) {
                break;
            }
            mix.add(mix.poll() + mix.poll() * 2);
            answer++;
            if (mix.peek() >= K) {
                break;
            }
        }
        
        return answer;
    }
}