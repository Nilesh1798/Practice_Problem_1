import java.util.*;
public class Volume_of_cylinder{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
System.out.println("Provide the Radius:")
int r=sx.nextInt();
int h=sx.nextInt();
double volume=Math.PI*r*r*h;
System.out.println("Area of Cylinder:"+volume);
}
}