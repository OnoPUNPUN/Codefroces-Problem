import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            String len = String.valueOf(arr[i]);

            for (int j = len.length() - 1; j >= 0; j--) {
                System.out.print(len.charAt(j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}