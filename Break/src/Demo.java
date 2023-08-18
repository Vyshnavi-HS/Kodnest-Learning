
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 1; i <=5; i++) {
			    if (i == 3) {
			        continue; // Skip the iteration when i is 3
			       // System.out.println("Can't execute this statement");//Error
			    }
			    System.out.println("i= "+i);
			    //We can place a statement after continue in next block
			}

			System.out.println("Loop ended");

	}

}
