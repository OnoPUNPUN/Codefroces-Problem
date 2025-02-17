import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int n = x / 10;
        int m = x % 10;

        if (n == 0 || m == 0) {
            System.out.println("YES");
        } else if (n % m == 0 || m % n == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}