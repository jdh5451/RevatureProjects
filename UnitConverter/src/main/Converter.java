package main;

import java.util.Scanner;

public class Converter {
	static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Converter c=new Converter();
		int response=0;
		while(response!=3) {
			System.out.println("Please select an option and then press Enter.");
			System.out.println("1: Distance Conversions");
			System.out.println("2: Temperature Conversions");
			System.out.println("3: Quit");
			if(myScanner.hasNextInt()==true) {
				response = myScanner.nextInt();
				c.inputMenus(response);
			}
			else System.out.println("Invalid input.");
		}
		
		myScanner.close();

	}
	
	public void inputMenus(int i) {
		switch(i){
			case 1:System.out.println("Please select an option and then press Enter.");
			System.out.println("1: Miles to Kilometers");
			System.out.println("2: Kilometers to Miles");
			System.out.println("3. Back");
			if(myScanner.hasNextInt()==true) {
				int response = myScanner.nextInt();
				switch(response) {
					case 1: System.out.println("Please input an value and then press Enter.");
						if(myScanner.hasNextDouble()==true) {
							double d=myScanner.nextDouble();
							System.out.println(d+" miles is equal to "+Converter.convertMilesToKilometers(d)+" kilometers.");
						} else System.out.println("Invalid input.");
						break;
						
					case 2: System.out.println("Please input an value and then press Enter.");
						if(myScanner.hasNextDouble()==true) {
							double d=myScanner.nextDouble();
							System.out.println(d+" kilometers is equal to "+Converter.convertKilometersToMiles(d)+" miles.");
						} else System.out.println("Invalid input.");
						break;
						
					case 3: break;
					
					default: System.out.println("Invalid input. Returning to main menu."); break;
				}
			}
			else System.out.println("Invalid input. Returning to main menu.");
			break;
			
			case 2:System.out.println("Please select an option and then press Enter.");
			System.out.println("1: Fahrenheit to Celsius");
			System.out.println("2: Celsius to Fahrenheit");
			System.out.println("3. Back");
			if(myScanner.hasNextInt()==true) {
				int response = myScanner.nextInt();
				switch(response) {
					case 1: System.out.println("Please input an value and then press Enter.");
						if(myScanner.hasNextDouble()==true) {
							double d=myScanner.nextDouble();
							System.out.println(d+" degrees Fahrenheit is equal to "+Converter.convertFahrenheitToCelsius(d)+" degrees Celsius.");
						} else System.out.println("Invalid input. Returning to main menu.");
						break;
						
					case 2: System.out.println("Please input an value and then press Enter.");
						if(myScanner.hasNextDouble()==true) {
							double d=myScanner.nextDouble();
							System.out.println(d+" degrees Celsius is equal to "+Converter.convertCelsiusToFahrenheit(d)+" degrees Fahrenheit.");
						} else System.out.println("Invalid input. Returning to main menu.");
						break;
						
					case 3: break;
					
					default: System.out.println("Invalid input. Returning to main menu."); break;
				}
			}
			else System.out.println("Invalid input. Returning to main menu.");
			break;
			
			case 3:break;
			
			default: System.out.println("Invalid input. Returning to main menu."); break;
		}
	}
	
	public static double convertMilesToKilometers(double m) {
		return m*1.609;
	}
	
	public static double convertKilometersToMiles(double k) {
		return k/1.609;
	}
	
	public static double convertCelsiusToFahrenheit(double c) {
		return (9*c/5)+32;
	}
	
	public static double convertFahrenheitToCelsius(double f) {
		return 5*(f-32)/9;
	}

}
