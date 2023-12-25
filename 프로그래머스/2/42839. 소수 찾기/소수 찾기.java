import java.util.*;
class Solution {
    public int solution(String numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length(); i++) {
            list.add(numbers.charAt(i)-'0');
        }
        Set<Integer> set = new HashSet<>();
        boolean[] visit = new boolean[numbers.length()];
        String temp = "";
        prime_find(set,numbers,temp,visit,0);
        System.out.println(set);
        for (Integer s : set) {
            int prime_checker = 0;
            for (int i = 1; i <= s; i++) {
                if (s % i == 0) {
                    prime_checker++;
                }
            }
            if (prime_checker == 2) {
                answer++;
            }
        }
        return answer;
    }

    static void prime_find(Set<Integer> set, String numbers, String temp, boolean[] visit, int n) {
        if (!(temp.isEmpty()) && !(temp.charAt(0)=='0')) {
            set.add(Integer.valueOf(temp));
        }
        for (int i = 0; i < numbers.length(); i++) {
            if (visit[i] == false) {
                visit[i] = true;
                temp += numbers.charAt(i);

                prime_find(set, numbers, temp, visit, i);
                temp = temp.substring(0, temp.length() - 1);
                visit[i] = false;
            }
        }
    }
}