import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        String[][] arr = new String[5][15];
        int maxLength = 0;
        for (int i = 0; i <5 ; i++) {
            String s = bf.readLine();
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = String.valueOf(s.charAt(j));
            }
        }

        for (int i = 0; i < maxLength ; i++) {
            for (int j = 0; j < 5; j++) {
                String str = arr[j][i];
                if (str == null) {
                    continue;
                }
                result += str;
            }
        }

        System.out.println(result);
    }
}
