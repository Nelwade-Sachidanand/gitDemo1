package gitConnect1;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		Scanner se=new Scanner(System.in);
		int num=se.nextInt();
		if(num%2==0) {
			System.out.println(num+" is even number");
		}else {
			System.out.println(num+" is odd number");
		}
	}
}
