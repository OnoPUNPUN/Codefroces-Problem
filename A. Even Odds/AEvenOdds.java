import java.util.Scanner;

public class AEvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        long oddCount = (n + 1) / 2;

        long answer;
        if (k <= oddCount) {
            answer = 2 * k - 1;
        } else {
            long idx = k - oddCount;
            answer = 2 * idx;
        }

        System.out.println(answer);

        sc.close();
    }
}