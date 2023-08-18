import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=scan.nextInt();
		System.out.println("Welcome to Kodnest");
		check(marks);
		

	}
	public static void check(int marks)
	{
		if(marks>=80) {
			System.out.println("Welcome to Techclub");
	}
		}
	

}
