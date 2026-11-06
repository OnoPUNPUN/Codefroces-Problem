import java.util.Scanner;

public class APerfectSandwiches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int diff = a - b;

            if (diff <= 0) {
                System.out.println(-1);
            } else {
                System.out.println(Math.min(b, diff));
            }
        }
        sc.close();
    }
}