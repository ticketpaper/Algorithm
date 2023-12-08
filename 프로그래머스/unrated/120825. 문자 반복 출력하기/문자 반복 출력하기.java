class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        char[] arr = my_string.toCharArray();
        for (char c : arr) {
            for(int i=0;i<n;i++){
                sb.append(c);
            }
        }
        return answer = sb.toString();
    }
}