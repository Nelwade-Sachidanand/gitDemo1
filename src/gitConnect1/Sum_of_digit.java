package gitConnect1;

import java.util.Scanner;

public class Sum_of_digit {
	public static void main(String[] args) {
		Scanner user_input=new Scanner(System.in);
		System.out.println("enter a number");
		int number=user_input.nextInt();
		int sum=0;
		if(number>0) {
		while(number>0) {
			int digit=number%10;
			sum+=digit;
			number=number/10;
		}
		System.out.println("digit sum is="+sum);
	   }
		else {
		System.out.println("please enter positive number");	
		}
	}
	
	
}
