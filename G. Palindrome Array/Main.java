import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Palindrome
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(arr[i] == arr[j] && i != j){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}