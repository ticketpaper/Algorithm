class Solution {
    public int solution(int n) {
        int answer = 0;
        String strN = String.valueOf(n);
        for(int i=0; i<strN.length(); i++){
            answer += strN.charAt(i)-48;
        }
        return answer;
    }
}