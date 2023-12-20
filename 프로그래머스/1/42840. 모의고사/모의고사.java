import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> student1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> student2 = new ArrayList<>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
        List<Integer> student3 = new ArrayList<>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));

        int stu1_answer = checker(student1,answers,0,0);
        int stu2_answer = checker(student2,answers,0,0);
        int stu3_answer = checker(student3,answers,0,0);

        int maxScore = Math.max(stu1_answer, Math.max(stu2_answer, stu3_answer));

        List<Integer> resultList = new ArrayList<>();
        if (stu1_answer == maxScore) resultList.add(1);
        if (stu2_answer == maxScore) resultList.add(2);
        if (stu3_answer == maxScore) resultList.add(3);

        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
    
    static int checker(List<Integer> student, int[] answers, int count, int answer) {
        for (int i : answers) {
            if (i == student.get(count)) {
                answer++;
            }
            count++;
            if (student.size() == count) {
                count=0;
            }
        }
        return answer;
    }
}