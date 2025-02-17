import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if ((a == 0 && b == 0) || Math.abs(a - b) >= 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
