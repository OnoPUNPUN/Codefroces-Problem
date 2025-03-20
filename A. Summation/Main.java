import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        long sum = 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println(Math.abs(sum));

        sc.close();
    }
}