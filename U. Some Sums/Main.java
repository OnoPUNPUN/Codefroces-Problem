import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++){
            if (i / 10 == 0){
                if (i >= a && i <= b){
                    sum += i;
                }
            } else {
                int sumDigits = 0;
                int temp = i;
                while (temp != 0){
                    sumDigits += temp % 10;
                    temp /= 10;
                }
                if (sumDigits >= a && sumDigits <= b){
                    sum += i;
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }
}