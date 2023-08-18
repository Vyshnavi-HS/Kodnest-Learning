package overloadingconstructor;

public class MobileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1=new Mobile("samsung","purple",125000);
		System.out.println(m1.brand+" "+m1.color+" "+m1.cost);
		Mobile m2=new Mobile();
		System.out.println(m2.brand+" "+m2.color+" "+m2.cost);
		Mobile m3=new Mobile("MI");
		System.out.println(m3.brand+" "+m3.color+" "+m3.cost);
		Mobile m4=new Mobile(40000);
		System.out.println(m4.brand+" "+m4.color+" "+m4.cost);
		
	}

}
