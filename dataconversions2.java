package example1;
import java.util.*;
public class Scannerexample {
	public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the digit: ");
	int n=sc.nextInt();
	
	int temp=n;
	int sum=0, rem=0;
	while(temp>0) {
		rem=temp%10;
		sum=sum+rem;
		temp=temp/10;
	}
	System.out.printf("The sum of the digits of the number is: %d", sum);
}
}
