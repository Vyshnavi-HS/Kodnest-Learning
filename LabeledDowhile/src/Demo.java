
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1;
	abc:  do
		{
			int i=1;
			xyz: do
			{
				System.out.println("*");
				i++;
				break abc;
				
			}while(i<=5);
						
		}while(j<=5);

	}

}
