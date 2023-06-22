package IntPkg;

import java.util.Scanner;

public class Compare2Nos {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st no:- ");
		int num1=sc.nextInt();
		
		System.out.println("Enter 2nd no:- ");
		int num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is greater");
		}
		else if(num2>num1) {
			System.out.println(num2+" is greater");
		}
		else if(num1==num2) {
			System.out.println("Both are equal");
		}

	}

}
