import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for (String val : croatia){
            input = input.replace(val,"A");
        }
        System.out.println(input.length());
    }
}
