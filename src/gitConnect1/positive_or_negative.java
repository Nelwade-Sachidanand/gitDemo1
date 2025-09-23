package gitConnect1;

import java.util.Scanner;

public class positive_or_negative {
	public static void main(String[] args) {
		Scanner se=new Scanner(System.in);
		System.out.println("enter a number");
		int number=se.nextInt();
		if(number>0) {
			System.out.println("number is positive");
		}else if(number<0) {
			System.out.println("number is negative");
		}else {
			System.out.println("number is zero");
		}
	}

}
