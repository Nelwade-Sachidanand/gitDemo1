package gitConnect1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner se=new Scanner(System.in);
		System.out.println("enter a number=");
		int num=se.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of number "+ num +" is="+ fact);
	}
}
