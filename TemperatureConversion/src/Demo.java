import java.util.Scanner;

public class Demo {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to temperature conversion tool");
		System.out.println("Select an option 1. Convert Celsius to Fahrenheit 2. Convert Fahrenheit to Celsius");
		System.out.println("Enter your choice:");
		int option=scan.nextInt();
		if(option==1)
		{
			System.out.println("Enter temperature in celsius:");
			double celcius=scan.nextDouble();
			double res1=DemoApp.celsiusTofahrenheit(celcius);
			System.out.println(celcius+" C is equivalent to "+res1+" F");
		}
		else if(option==2)
		{
			System.out.println("Enter temperature in fahrenheit:");
			double fahrenheit=scan.nextDouble();
			double res2=DemoApp.fahrenheitToCelsius(fahrenheit);
			System.out.println(fahrenheit+" F is equivalent to "+res2+" C");
		}
		else
		{
			System.out.println("Invalid option");
		}
		
		
	}
}
