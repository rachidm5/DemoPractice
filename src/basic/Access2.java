package basic;

import java.util.Scanner;

public class Access2 {

	static Scanner sc = new Scanner(System.in);
	static int num1;
	static int maxEmployee = 3;

	public static void start() {
		System.out.println("==== welcome ====");
	}

	public static void getInput() {

		System.out.println("Enter a number : ");
		int num1 = sc.nextInt();
		int i;
		for (i = 0; i < 10; i++) {
			System.out.println(num1 + "x" + (i + 1) + "=" + (num1 * (i + 1)));
		}

	}

	public static void exit() {
		System.out.println();
		System.out.println();
		System.out.println("Thank yoy for passing by and See you next time");
	}

	public static void continuYesorNo() {
		String choice;
		boolean bcontinue;

		Scanner mysc = new Scanner(System.in);
		System.out.println("Do you want to Continue ...");
		choice = mysc.nextLine();
		
		if (choice.equals("yes")) {
			bcontinue = true;
		} else{
			bcontinue = false;
		}

	}

	public static void main(String[] args) {
		start();

		for (int i = 0; i < maxEmployee; i++) {
			getInput();
			continuYesorNo();
		}

		exit();

	}

}
