// https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/G
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] revArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = arr.length - 1, j = 0; i >=0; i--, j++){
            revArr[j] = arr[i];
        }

        if(Arrays.equals(arr, revArr)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}