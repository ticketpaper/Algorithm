class Solution {
    public int solution(int[] numbers) {
        int answer = 0,temp = 0;
        for(int i=0; i<numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return answer=numbers[0]*numbers[1]; 
        
    }
}