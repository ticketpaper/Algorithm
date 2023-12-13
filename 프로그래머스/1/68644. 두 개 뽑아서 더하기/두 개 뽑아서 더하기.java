import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> combi = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                combi.add(numbers[i]+numbers[j]);
            }
        }
        System.out.println(combi);
        combi.sort(Comparator.naturalOrder());
        Set<Integer> answer_set = new TreeSet<>(combi);
        System.out.println(answer_set);

        int[] answer = new int[answer_set.size()];
        int count = 0;
        for (Integer i : answer_set) {
            answer[count] = i;
            count++;
        }
        return answer;
    }
}