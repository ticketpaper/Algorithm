import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String urStr = bf.readLine(); //level
        int count=0,equal=0;
        for(int i=0,j=urStr.length()-1;i<urStr.length();i++,j--){
            if(urStr.charAt(i)==urStr.charAt(j)){count++;}
        }
        if(count==urStr.length()){equal=1;}
        System.out.println(equal);
    }
}
