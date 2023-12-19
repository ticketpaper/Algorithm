import java.util.*;

class Solution {
    static int answer;
    public int solution(int k, int[][] dungeons) {
        Stack<Integer> stack = new Stack<>();
        boolean[] dnfvisit = new boolean[dungeons.length];
        Dnf(dungeons, dnfvisit,stack, k,0);
        return answer;
    }
    
    static void Dnf(int[][] Dungeons, boolean[] visit, Stack<Integer> stack, int k, int countd) {
        for (int i = 0; i < Dungeons.length; i++) {
            if (stack.size() > answer) {
                answer= stack.size();
            }
            if (visit[i]==false && k >= Dungeons[i][0]) {
                visit[i] = true;
                stack.add(i);
                k -= Dungeons[i][1];
                Dnf(Dungeons, visit, stack, k,countd+1);
                k += Dungeons[i][1];
                stack.pop();
                visit[i] = false;
            }
        }
    }
}