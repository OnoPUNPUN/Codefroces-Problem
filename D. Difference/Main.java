import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a, b, c, d;

        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        d = sc.nextLong();

        long x = (a*b) - (c*d);

        System.out.println("Difference = " + x);
        sc.close();
    }
}