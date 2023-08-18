import java.util.Scanner;

public abstract class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your temperature in fahrenheit");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		double celcius=temperatureConverter.convertFahrenheitToCelcius(fahrenheit);
		System.out.println(celcius);
		

	}

}
