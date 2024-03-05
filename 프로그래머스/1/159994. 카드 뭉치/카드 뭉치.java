import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        Deque<String> dequeC1 = new ArrayDeque<>();
        Deque<String> dequeC2 = new ArrayDeque<>();
        Deque<String> dequeGo = new ArrayDeque<>();
        for(String a: cards1){
            dequeC1.add(a);
        }
        for(String a: cards2){
            dequeC2.add(a);
        }
        for(String a: goal){
            dequeGo.add(a);
        }
        while(!dequeGo.isEmpty()){
            if(!dequeC1.isEmpty() && dequeC1.peekFirst().equals(dequeGo.peekFirst())){
                System.out.println(dequeC1.pollFirst());
                System.out.println(dequeGo.pollFirst());
            }else if(!dequeC2.isEmpty() && dequeC2.peekFirst().equals(dequeGo.peekFirst())){
                System.out.println(dequeC2.pollFirst());
                System.out.println(dequeGo.pollFirst());
            }else{
                answer = "No";
                break;
            }
            
        }   
        
        
        return answer;
    }
}