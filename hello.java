import java.util.*;
public class hello{
public static void main(String args[]){
	int x=10;
	String s1="";
	String s2="";
	for(int i=1;i<=10;i++){
		if(i%2==0){
		s1=s1+","+i;
		}
		else{
		s2=s2+","+i;
		}
	}
System.out.println("even numbers:"+s1);
System.out.println("odd numbers:"+s2);
}
}
