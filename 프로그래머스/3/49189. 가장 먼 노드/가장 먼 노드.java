import java.util.*;
class Solution {
    static List<List<Integer>> adjList;
    static boolean[] visit;
    static int[] distance;
    public int solution(int n, int[][] edge) {
        adjList = new ArrayList<>();
        visit = new boolean[n+1];
        distance = new int[n+1];

        for (int i = 1; i <= n+1; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] ints : edge) {
            addEdge(ints[0], ints[1]);
        }
        bfs(1);
        int max = distance[0];
        for (int i : distance) {
            if (max < i) {
                max = i;
            }
        }
        int answer =0;
        for (int i : distance) {
            if (i == max) {
                answer++;
            }
        }
        return answer;
    }
    static void addEdge(int a, int b) {
        adjList.get(a).add(b);
        adjList.get(b).add(a);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visit[start]= true;
        while (!queue.isEmpty()) {
            int next = queue.poll();
            for (Integer target : adjList.get(next)) {
                if (visit[target] != true) {
                    queue.add(target);
                    distance[target] = distance[next] + 1;
                    visit[target] = true; // true로 안하면 또 방문해버림
                }
            }
        }
    
    }
}