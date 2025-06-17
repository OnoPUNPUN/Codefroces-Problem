import java.util.Scanner;

public class I_Smallest_Pair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();


        for (int t = 0; t < testCases; t++) {
            solve(sc);
        }

        sc.close();
    }
    
    private static void solve(Scanner sc) {
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        long min = Long.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                long c = (long) arr[i] + arr[j] + j - i;

                if (c < min) {
                    min = c;
                }
            }
        }

        System.out.println(min);
    }
}