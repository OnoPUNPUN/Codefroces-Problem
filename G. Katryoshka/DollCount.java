import java.util.Scanner;

public class DollCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long eye = scanner.nextLong();
        long mouth = scanner.nextLong();
        long body = scanner.nextLong();

        long doll = 0;
        while (body != 0) {
            if (eye != 0 && mouth != 0) {
                if (mouth <= eye && mouth <= body) {
                    doll += mouth;
                    body -= mouth;
                    eye -= mouth;
                    mouth = 0;
                } else {
                    doll += eye;
                    body -= eye;
                    mouth -= eye;
                    eye = 0;
                }
            } else {
                long _doll = eye / 2;
                if (_doll >= body) {
                    doll += body;
                } else {
                    doll += _doll;
                }
                break;
            }
        }
        System.out.println(doll);
        scanner.close();
    }
}