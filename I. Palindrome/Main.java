import java.util.Scanner;

public class Main {
        static int reverse(int n) {
            int reversed = 0;
            while (n != 0) {
                reversed = reversed * 10 + n % 10;
                n /= 10;
            }
            return reversed;
        }        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        if (n == reverse(n)) {
            System.out.println(reverse(n));
            System.out.println("YES");
        } else {
            System.out.println(reverse(n));
            System.out.println("NO");
        }
        sc.close();
    }
}