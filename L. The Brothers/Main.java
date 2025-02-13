import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 1st person name
        String f1 = sc.next().trim();
        String s1 = sc.next().trim();

        // 2nd person name
        String f2 = sc.next().trim();
        String s2 = sc.next().trim();

        if(s1.equalsIgnoreCase(s2)){
            System.out.println("ARE Brothers");
        } else{
            System.out.println("NOT");
        }

        sc.close();
    }
}