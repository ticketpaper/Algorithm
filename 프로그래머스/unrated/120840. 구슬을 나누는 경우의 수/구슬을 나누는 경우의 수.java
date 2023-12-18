class Solution {
    static int answer = 0, count = 0;
    public int solution(int balls, int share) {
        recur(balls, share, 0);
        return answer;
    }
    
    static void recur(int balls, int share, int start) {
        if (count == share) {
            answer++;
            return;
        }
        for (int i = start; i < balls; i++) {
            count++;
            recur(balls, share, i+1);
            count--;
        }
    }
}