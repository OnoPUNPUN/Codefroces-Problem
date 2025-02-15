import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, maxx, minn;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        maxx = Math.max(a, Math.max(b, c));
        minn = Math.min(a, Math.min(b, c));

        System.out.println(minn);

        if ((a == maxx && b == minn) || (a == minn && b == maxx)) {
            System.out.println(c);
        } else if ((b == maxx && c == minn) || (b == minn && c == maxx)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        System.out.println(maxx);
        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scanner.close();
    }
}