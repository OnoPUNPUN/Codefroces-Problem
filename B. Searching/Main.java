import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean f = false;
        
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int s = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == s) {
                System.out.println(i);
                f = true;
                break;
            }
        }

        if (!f) {
            System.out.println(-1);
        }
        sc.close();
    }
}