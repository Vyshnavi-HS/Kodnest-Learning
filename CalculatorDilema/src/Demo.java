import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 values to perform operation");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Enter operation you want to perform(1-4)");
		System.out.println("1-addition 2-subtraction 3-multiplication 4-division");
		int operation=scan.nextInt();
		switch(operation)
		{
		case 1:
		{
		 System.out.println("addition result = "+(num1+num2));
		 break;
		}
		case 2:
		{
		 System.out.println("subtraction result = "+(num1-num2));
		 break;
		}
		case 3:
		{
		 System.out.println("multiplication result = "+(num1*num2));
		 break;
		}
		case 4:
		{
		 System.out.println("Division result = "+(num1/num2));
		 break;
		}
		default:
			System.out.println("Invalid option");
			
		}
		

	}

}
