import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n = sc.nextFloat();
        int m = (int)(n);

        if(n - m == 0){
            System.out.println("int " + m);
        } else {
            System.out.println("float " + m + " " + (n - m));
        }

        sc.close();
    }
}