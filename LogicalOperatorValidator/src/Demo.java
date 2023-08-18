import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is input valid(True/False)");
		boolean input=scan.nextBoolean();
		System.out.println("Does input meet a certain condition");
		boolean condition=scan.nextBoolean();
		boolean result=isValidInput(input,condition);
		if(result==true)
		{
			System.out.println("Input is valid");
		}
		else
		{
			System.out.println("Input is invalid");
		}
		
		
	}
	public static boolean isValidInput(boolean input,boolean condition)
	{
		return input && condition;
	}

}
