import java.util.Scanner;

public class A_Timon_and_Pumbaa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();


        int r = a - b;

        if(r >= 0){
            System.out.println(r);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}