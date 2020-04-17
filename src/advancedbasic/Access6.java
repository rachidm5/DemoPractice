package advancedbasic;

import java.util.Scanner;

public class Access6 {

	public static void SwictchCase() {

		Scanner SwitchScan = new Scanner(System.in);

		System.out.println("enter a number");

		int WeekDays = SwitchScan.nextInt();

		 //int WeekDays1  = 5;

		 String weekDaysName = null;

		switch (WeekDays) {

		case 1:

			 weekDaysName = "saturday";
			//System.out.println("saturday");
			break;

		case 2:

			 weekDaysName= "sunday";
			//System.out.println("sunday");
			break;

		case 3:

			 weekDaysName = "monday";
			//System.out.println("monday");
			break;

		case 4:

			 weekDaysName= "tuesday";
			//System.out.println("tuesday");
			break;

		case 5:

			 weekDaysName = "wednesday";
			//System.out.println("This is Wednesday : N " +WeekDays);
			break;

		case 6:

			 weekDaysName= "thursday";
			//System.out.println("thursday");
			break;

		case 7:

			 weekDaysName = "friday";
			System.out.println("friday");
			break;

		default:

			 weekDaysName = "invalid, please select a number between 1 and 7";
			//System.out.println("invalid, please select a number between 1 and 7");

		}

		 System.out.println("selected day is : " + weekDaysName);

	}

	public static void main(String[] args) {

		for (int i = 0; i <= 7; i++) {

			Access6.SwictchCase();

			String doYouwantToContinueTheProgram;

			Scanner MyScanner = new Scanner(System.in);

			System.out.println("\n do you want to continue ");

			doYouwantToContinueTheProgram = MyScanner.nextLine();

			if (doYouwantToContinueTheProgram.equals("no")) {

				break;

			}

		}

	}
}