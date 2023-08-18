import java.util.Scanner;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=scan.nextInt();
		Demo d1=new Demo();
		d1.checkGrade(marks);

	}

}
