package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int year;
		System.out.print("Give me the year number:");
		year = in.nextInt();
		boolean isleap;
		isleap = year%400==0 || year%4==0 && year%100!=0;
		System.out.print(isleap);
	}

}
