import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int[] Alphabet = new int[26];
        for(int i=0;i<str.length();i++){
            int a = str.charAt(i);
            if (a>=97){ a -= 32;}
            Alphabet[a-65]++;
        }
        int max = 0;
        char ans = 0;
        for(int i=0; i<Alphabet.length; i++){
            if (Alphabet[i]>max){
                max = Alphabet[i];
                ans = (char)(i+65);
            }
            else if(Alphabet[i]==max)
                ans = '?';
        }
        System.out.println(ans);
    }
}
