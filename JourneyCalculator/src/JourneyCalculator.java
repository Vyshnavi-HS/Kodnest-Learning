import java.util.Scanner;

public class JourneyCalculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of speed of speed and time");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculatorr d=new JourneyCalculatorr();
		double res=d.calculateDistance(speed, time);
		System.out.println(res);
		
		
		
		

	}
}
