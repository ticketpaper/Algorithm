class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int max_denom = Math.max(denom1, denom2);
        int min_denom = Math.min(denom1, denom2);
        if (max_denom % min_denom == 0){
            answer[1] = max_denom / min_denom * min_denom;
            if (max_denom == denom1) {
                answer[0] = numer1 + numer2 * (max_denom / min_denom);
            } else {
                answer[0] = numer2 + numer1 * (max_denom / min_denom);
            }
        }
        else {
            answer[1] = max_denom * min_denom;
            answer[0] = numer1 * denom2 + numer2 * denom1;
        }
        int min = Math.min(answer[0],answer[1]);
        int chleo = 0;
        for (int i = 1; i <= min; i++) {
            if (answer[0] % i == 0 && answer[1] % i == 0 ) {
                chleo = i;
            }
        }
        answer[0] /= chleo;
        answer[1] /= chleo;
        return answer;
    }
}