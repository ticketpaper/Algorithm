class Solution {
    public int solution(int n) {
        StringBuilder three = new StringBuilder();
        int answer = 0;
        while (n>0) {
            three.append(n % 3);
            n = n / 3;
        }

        System.out.println(three);
        for (int i = three.length() - 1, j = 0; i >= 0; i--, j++) {
            int a =three.charAt(i)-'0';
            answer += (int) (a * (Math.pow(3, j)));
        }
        return answer;
    }
}