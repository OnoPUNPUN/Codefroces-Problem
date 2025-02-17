import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l1 = scanner.nextInt();
        int r1 = scanner.nextInt();
        int l2 = scanner.nextInt();
        int r2 = scanner.nextInt();

        int i = Math.max(l1, l2);
        int j = Math.min(r1, r2);

        if (i <= j) {
            System.out.println(i + " " + j);
        } else {
            System.out.println("-1");
        }

        scanner.close();
    }
}