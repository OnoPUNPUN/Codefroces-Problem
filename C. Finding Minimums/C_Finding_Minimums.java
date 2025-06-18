import java.util.Scanner;

public class C_Finding_Minimums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        StringBuilder output = new StringBuilder();
        int currentMin = Integer.MAX_VALUE;
        int countInGroup = 0;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();

            if (num < currentMin) {
                currentMin = num;
            }
            countInGroup++;

            if (countInGroup == K || (i + 1 == N && countInGroup > 0)) { 
                 output.append(currentMin).append(" ");
                 currentMin = Integer.MAX_VALUE;
                 countInGroup = 0; 
            }
        }

        System.out.println(output.toString().trim());
        scanner.close();
    }
}