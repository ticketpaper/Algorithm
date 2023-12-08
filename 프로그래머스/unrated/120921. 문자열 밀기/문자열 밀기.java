class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(A);
        for(int i=0;i<A.length();i++){
            sb.insert(0, sb.charAt(sb.length()-1));
            sb.delete(sb.length()-1,sb.length());
            ++answer;
            if (sb.toString().equals(B)){
                break;
            }
        }
        if(A.equals(B)){
            answer =0;
        }
        if(!(sb.toString().equals(B))){
            answer =-1;
        }
        return answer;
    }
}