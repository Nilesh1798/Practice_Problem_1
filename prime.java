import java.util.*;
public class prime {

    public static void main(String[] args) {
        String s = "";
        for (int i = 2; i <= 10; i++) {
            if (i == 2 || i == 3) {
                s = s + "," + i;
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                s = s + "," + i;
            }
        }
        System.out.println("Prime numbers in range 1-10 is:" + s);
    }
}

