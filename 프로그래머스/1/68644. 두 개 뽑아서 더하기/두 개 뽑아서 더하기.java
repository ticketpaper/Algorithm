import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int index = 0, index2 = 0;
        Arrays.sort(numbers);

        int[] temp = new int[numbers.length*numbers.length];
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                temp[index]= numbers[i]+numbers[j];
                index++;
            }
        }

        int[] temp_ans = Arrays.copyOfRange(temp, 0, index);
        Arrays.sort(temp_ans);

        int[] temp_answer = new int[temp_ans.length];
        for (int i = 0; i < temp_ans.length - 1; i++) {
            if (temp_ans[i] != temp_ans[i + 1]) {
                temp_answer[index2] = temp_ans[i];
                index2++;
            }
        }
        temp_answer[index2++] = temp_ans[temp_ans.length - 1];
        int[] answer = Arrays.copyOfRange(temp_answer, 0, index2);

        return answer;
    }
}