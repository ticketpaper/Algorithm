import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int count = 0, index = 0, index2 = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                count++;
            }
        }
        int[] temp = new int[count];
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                temp[index]= numbers[i]+numbers[j];
                index++;
            }
        }
        Arrays.sort(temp);

        int[] temp_ans = new int[temp.length];
        for (int i = 0; i < temp.length-1; i++) {
            if (temp[i] != temp[i + 1]) {
                temp_ans[index2] = temp[i];
                index2++;
            }
        }
        temp_ans[index2++] = temp[temp_ans.length-1];
        int[] answer = Arrays.copyOfRange(temp_ans,0,index2);
        return answer;
    }
}