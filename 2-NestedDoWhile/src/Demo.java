
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1;
    Outerloop:	do
		{
			int i=1;
		Innerloop:	do
			{
				System.out.println("This statement is executed only once");
				i++;
				break Outerloop;
				
			}while(i<=5);
	
			
		}while(j<=5);
	}

}
