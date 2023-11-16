class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (angle==90) return answer = 2;
        else if (90<angle && angle<180) return answer = 3;
        else if (angle ==180) return answer = 4;
        else return answer=1;
    }
}