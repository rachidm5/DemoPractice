package basic;

import java.util.Scanner;

public class HelloWorld {

	
	
		
		static String nameOfEmployee;
		static double numberOfHourWorked;
		static double hourlyPayRate;
		static double grossPay;
		static double netpay;
		
		
		//Modulle 1: welcome 
			public static void wellcome() {
			System.out.println("welcome to EMP cal- please folow the instruction");
			System.out.println();
			System.out.println();
			
		}
		//Module 2 : input 
	   
		public static void getInput() {
			
			Scanner Hr = new Scanner(System.in) ;
			System.out.println("enter employee name ");
			nameOfEmployee = Hr.nextLine();
			
			boolean continueToNextStep;
			
		do {
			try {
				 Hr = new Scanner(System.in);
				System.out.println("enter number of hours ");
				numberOfHourWorked = Hr.nextDouble();		
				 if(numberOfHourWorked>=0 && numberOfHourWorked <=80) {
				 continueToNextStep = true;
				 
			} else {
				System.out.println("enter hours between 0-80");
				continueToNextStep = false;
			}
				
			        }catch (Exception e ) {
			        	System.out.println("eneter the number between 0 - 80");
			        	continueToNextStep = false;
			        }
			}while (! continueToNextStep);
		
		do {
			try {
				 Hr = new Scanner(System.in);
				System.out.println("enter hour rate  ");
				hourlyPayRate = Hr.nextDouble();		
				 if(hourlyPayRate>=15 && hourlyPayRate <=30) {
				 continueToNextStep = true;
				 
			} else {
				System.out.println("enter hourly rate between 15-30");
				continueToNextStep = false;
			}
				
			        }catch (Exception e ) {
			        	System.out.println("enter hourly rate between 15 & 30");
			        	continueToNextStep = false;
			        }
			}while (! continueToNextStep);
			
			
		
		}
		
		
		
		      
				
			
		
		
			
			
		
		public static void CalculateSalary() {
			calculatGrossPay();
			calculatNetpay() ;
		}
		//module 3: grosspay 
		public static void calculatGrossPay() {
			
			grossPay=numberOfHourWorked*hourlyPayRate ;
		}
		
		


		
		 //module 4: net pay 
		public static void calculatNetpay() {
			if (grossPay>0 && grossPay<=1500) {
				netpay=grossPay-(grossPay*15)/100;
				
				
			}else if (grossPay>1500 && grossPay<=3000) {
				netpay= grossPay-(grossPay*19)/100;
			}else if (grossPay>3000 && grossPay<=4500) {
				netpay = grossPay-(grossPay*21)/100;
				
			}else if (grossPay>4500 && grossPay<=6000) {
				netpay = grossPay-(grossPay*23)/100;
				
		
			}else if (grossPay>6000) {
				netpay = grossPay-(grossPay*27)/100;
				
				
					
				
			}else { grossPay=0;
				System.out.println("invalid input warning ");
				
			}
				
			
		}
		
		
		//module 3 : display 
		public static void displayOUTput() {
			
			
		System.out.println();
		System.out.println("=============================");
		System.out.println("EMPLOYEES Name ");
		System.out.println("EMPLYEES TOTAL IS: "+numberOfHourWorked);
		System.out.println("“ Payment Rate Of employee  " +hourlyPayRate);
		System.out.println("The employee grossPay is " +  grossPay);
		System.out.println("the employee netPay is  " +netpay);
		System.out.println("==========================");
	}

	   //Module 4:exitprogrma 
		public static void exit() {
			System.out.println("have a nice day ");
			
		}
		public static void main(String[] args) {
			

				
			wellcome();
			
			for( int i = 0 ; i<=3;i++) {
				System.out.println("Employee payroll"+(i+1));
			
				
					getInput();
					CalculateSalary() ;
				displayOUTput() ;
				
				
				
				String doYouwantToContinueTheProgram;
				
				Scanner MyScanner =new Scanner (System.in);
				System.out.println("do you want to continue ");
				
				doYouwantToContinueTheProgram=MyScanner.nextLine();
				
				
				if (doYouwantToContinueTheProgram.equals("no")) {
					break;
					
				}
				
				
				

		
			}



			
			
			exit();
			
			
			
			
			
			

		
	
	
	}
		
		
	
	}
	
	
	
	 
	
	 
	 
	  
	  
	  
	  
	


