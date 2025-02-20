import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int m = Math.min(a, b);

        for (int i = m; i >= 1; i--){
            if (a % i == 0 && b % i == 0){
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}