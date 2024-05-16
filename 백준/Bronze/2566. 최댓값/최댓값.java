import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] result = new int[9][9];
        int max = 0;
        String XY = null;
        for (int i = 0; i < 9 ; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < 9; j++) {
                int nextNum = Integer.parseInt(st.nextToken());
                if(nextNum >= max){
                    max = nextNum;
                    XY = (i+1)+" "+(j+1);
                }
                result[i][j] = nextNum;
            }
        }
        System.out.println(max);
        System.out.println(XY);
    }
}
