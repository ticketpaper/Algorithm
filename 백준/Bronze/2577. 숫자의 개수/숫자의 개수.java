import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] check =new int[10];
        String mul = String.valueOf(A*B*C);
        for (char c : mul.toCharArray()) {
            check[Integer.valueOf(c)-48]++;
        }

        for (int i : check) {
            System.out.println(i);
        }
    }
}
