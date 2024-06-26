import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<prio_index> queue = new ArrayDeque<>();
        Queue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());
        int index = 0;
        int max = 0;
        int answer = 0;

        for (int priority : priorities) {
            queue.add(new prio_index(priority,index));
            maxQueue.add(priority);
            index += 1;
        }
        max = maxQueue.poll();


        while (!queue.isEmpty()) {
            if (queue.peek().prio == max) {
                if (queue.peek().index == location) {
                    answer++;
                    break;
                } else {
                    queue.poll();
                    max = maxQueue.poll();
                    answer++;
                }
            } else {
                queue.add(queue.poll());
            }
        }
        return answer;

    }
}
class prio_index{
    int prio;
    int index;

    public prio_index(int prio, int index) {
        this.prio = prio;
        this.index = index;
    }
}