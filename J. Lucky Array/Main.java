import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int counter = 0;

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                counter++;
            }
        }

        if(counter % 2 == 0){
            
            System.out.println("Unlucky");
        } else {
            System.out.println("Lucky");
        }

        sc.close();
    }
}