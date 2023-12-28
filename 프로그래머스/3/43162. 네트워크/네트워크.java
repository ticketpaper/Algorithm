class Solution {
    static int[][] computers;
    static boolean[] visit;
    static int count = 0;
    
    public int solution(int n, int[][] computers) {
        visit = new boolean[n];
        int answer = 0;
        this.computers = computers;


        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                dfs(i);
                answer++;
            }
        }

        return answer;
    }

    static void dfs(int start) {
        count++;
        visit[start] = true;
        for (int i = 0; i < computers[start].length; i++) {
            if (!visit[i] && computers[start][i] == 1) {
                dfs(i);
            }
        }
    }
}