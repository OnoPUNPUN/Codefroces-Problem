// https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/Z

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();
            int low = 0;
            int high = n - 1;
            boolean isFound = false;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == x) {
                    isFound = true;
                    break;
                } else if (arr[mid] < x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            if (isFound) {
                System.out.println("found");
            } else {
                System.out.println("not found");
            }
        }

        sc.close();

    }
}