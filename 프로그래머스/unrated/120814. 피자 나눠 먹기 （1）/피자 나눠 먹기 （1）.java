class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n<=7) answer=1;
        else if (n/7*7 < n) answer = n/7 + 1;
        else answer=n/7;
        return answer;
    }
}