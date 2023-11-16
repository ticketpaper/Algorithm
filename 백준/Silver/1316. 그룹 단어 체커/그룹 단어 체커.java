import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); // 입력 받은 단어 개수
        int count = N; // 그룹 단어 개수 세기 위함

        for(int i=0; i<N; i++){
            String STR= bf.readLine(); // 문자열 입력
            char prevChar = STR.charAt(0); // 이전 문자
            boolean[] Checker = new boolean[26]; // 알파벳 개수 26개 만큼 배열 생성 (디폴트값 false)

            for (int j = 1; j < STR.length(); j++) {
                char currentChar = STR.charAt(j); // 현재 문자

                if (prevChar != currentChar) { // 이전 문자와 현재 문자가 같지 않으면
                    if (Checker[currentChar - 'a']) { //
                        count--;
                        break;
                    }
                    Checker[prevChar - 'a'] = true; // 이전 문자
                }
                prevChar = currentChar;
            }
        }
        System.out.println(count);
    }
}
