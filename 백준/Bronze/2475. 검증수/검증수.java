import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] s = num.split(" ");
        int answer = 0;
        for (String i : s) {
            int pow = (int) Math.pow(Integer.valueOf(i), 2);
            answer += pow;
        }
        answer %= 10;
        System.out.println(answer);
    }
}
