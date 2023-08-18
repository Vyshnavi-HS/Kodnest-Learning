
public class Demo {

	public static void main(String[] args) {
		//float a=3.147;//Error as 3.147 is treated as double//float a(float)3.147//no error
		float a=3.147F;
		System.out.println(a);
		System.out.println("================");
		/* below declaration is error 
		 * The literal 2.147483649 of type int is out of range
		 */
		//long d=2147483647//error
		long d=2147483647L;
		System.out.println(d);
		long e=217483647;
		System.out.println(e);
		long f=221L;
		System.out.println(f);
	}

}
