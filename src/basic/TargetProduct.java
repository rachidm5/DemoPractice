package basic;

import java.util.Scanner;

public class TargetProduct {

	// declare variavle :
	static String prodName;
	static double unitPric;
	static int quPurchs;
	static double amouPaid;
	static double discount;

	public static void start() {
		System.out.println("\n Welcome to Target, Please folow the Instructions ...");

	}

	public static void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product Name : ");
		prodName = sc.nextLine();
		System.out.println("Enter unit Price : ");
		unitPric = sc.nextDouble();
		boolean continueToNextStep;
		do { 
		    try {
		    	
		    sc = new Scanner(System.in);
			System.out.println("Enter Quantity of Product : ");
		    quPurchs = sc.nextInt();
		if(quPurchs>0) {
			continueToNextStep = true; // condition is satisfied so continue to calculate the amounPaid method.
			}else {
				System.out.println("Enter quantity of product  ");
			  continueToNextStep = false;
			  }
		}catch(Exception p) {
			System.out.println("Please enter a Number > 0 ");
			 continueToNextStep = false;}
		
		}while(!continueToNextStep); // condition (renvers logic): loops untile is true.
	
	} 


public static void calculate() {
		amouPaid = unitPric * quPurchs;

	}

	public static void desplay() {
		System.out.println("Name of Product : " + prodName);
		System.out.println("Unit Price : " + unitPric);
		System.out.println("Quantity Purchase : " + quPurchs);
		System.out.println("================================");
		if (amouPaid > 0 && amouPaid <= 150) {
			System.out.println("This amout with discount : " + (amouPaid - (amouPaid * 10 / 100)));
			System.out.println("Discount %10");
		} else if (amouPaid > 150 && amouPaid <= 300) {
			System.out.println("This amout with discount : " + (amouPaid - (amouPaid * 20 / 100)));
		} else {
			System.out.println("This amout with discount : " + (amouPaid - (amouPaid * 30 / 100)));
		}
	}

	public static void main(String[] args) {

		start();
		getInput();
		calculate();
		desplay();

	}

}
