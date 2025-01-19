import java.util.Scanner;
public class Km {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the distance in kilometers: ");
double kms = sc.nextDouble();
double miles = kms * 0.621371;
System.out.println("The distance in miles is: " + miles);
}
}