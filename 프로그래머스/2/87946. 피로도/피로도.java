import java.util.*;

class Solution {
    static int answer;
    public int solution(int k, int[][] dungeons) {
        boolean[] dnfvisit = new boolean[dungeons.length];
        Dnf(dungeons, dnfvisit, k,0);
        return answer;
    }
    
    static void Dnf(int[][] Dungeons, boolean[] visit, int k, int countd) {
        for (int i = 0; i < Dungeons.length; i++) {
            if (countd > answer) {
                answer= countd;
            }
            if (visit[i]==false && k >= Dungeons[i][0]) {
                visit[i] = true;
                k -= Dungeons[i][1];
                Dnf(Dungeons, visit, k,countd+1);
                k += Dungeons[i][1];
                visit[i] = false;
            }
        }
    }
}