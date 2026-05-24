/*
I'm not some pure heart chasing after dreams.
I know how difficult it is to live an ordinary life,
having to overlook each other's shortcomings.
*/

import java.util.Arrays;
import java.util.Scanner;;

public class BYourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String q = sc.next();
            System.out.println(check(s, q));
        }
        sc.close();
    }

    public static String check(String str1, String str2) {
        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();

        Arrays.sort(charStr1);
        Arrays.sort(charStr2);

        if (Arrays.equals(charStr1, charStr2)) {
            return "YES";
        }
        return "NO";
    }

}
