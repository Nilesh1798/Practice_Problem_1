import java.util.Scanner;
public class threedigit {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Enter five Random numbers:");
        for (int i = 0; i < 5; i++) {
            num[i] = sx.nextInt();
        }
        int max = num[0];
	int min = num[0];
        for (int i = 1; i < 5; i++) {
            if (num[i] > max) {
                max = num[i];
            }
	     if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("The maximum number is: " + max);
	System.out.println("the minimum number is: " + min);
    }
}
