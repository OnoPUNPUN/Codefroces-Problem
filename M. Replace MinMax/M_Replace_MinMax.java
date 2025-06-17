import java.util.Scanner;

public class M_Replace_MinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }

        int temp = min - 1; 
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                arr[i] = temp;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                arr[i] = min;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == temp){
                arr[i] = max;
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}