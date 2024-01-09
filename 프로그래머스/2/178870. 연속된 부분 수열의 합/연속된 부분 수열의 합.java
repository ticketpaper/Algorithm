import java.util.*;
class Solution {
    static int[] check(int[] sequence, int k ) {
        int start = 0, end = 0;
        int sum = 0;
        int size = sequence.length;
        int a = 0, b = 0;
        for (end = 0; end < sequence.length; end++) {
            sum += sequence[end];
            while (sum > k) {
                sum -= sequence[start];
                start++;
            }
            if (sum == k) {
                if (size > end - start) {
                    size = end - start;
                    a = start;
                    b = end;
                }
            }
        }
        return new int[]{a, b};
    }
    public int[] solution(int[] sequence, int k) {
        int[] answer = check(sequence, k);
        return answer;
    }

}