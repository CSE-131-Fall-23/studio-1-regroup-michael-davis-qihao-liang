package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double n1;
		double n2;
		System.out.print("first number:");
		n1 = in.nextDouble();
		System.out.print("second number:");
		n2 = in.nextDouble();
		System.out.print((n1+n2)/2);
	}

}
