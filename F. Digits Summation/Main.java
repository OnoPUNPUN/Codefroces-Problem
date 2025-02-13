import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long K = sc.nextLong();

        long X = (N % 10 + K % 10);

        System.out.println(X);

        sc.close();
    }
}