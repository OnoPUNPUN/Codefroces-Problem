import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int x = (int) Math.pow(a, b);
        
        int y = (int) Math.pow(c, d);

        if (x > y) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

        sc.close();
    }
}