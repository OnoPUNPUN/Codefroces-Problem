import java.util.Scanner;

public class Main {
    public static void Sum(int a, int b){
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if(i % 2 != 0){
                sum += i;
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                Sum(b, a);
            } else {
                Sum(a, b);
            }
            n--;
        }
        sc.close();
    }
}