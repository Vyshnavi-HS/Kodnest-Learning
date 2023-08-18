package deafaulterror;

public class MobileApp {

	public static void main(String[] args) {
		Mobile m1=new Mobile("samsung","purple",125000);
		System.out.println(m1.brand+" "+m1.color+" "+m1.cost);
		m1.allowToPlay();
		m1.allowToTalk();
		//Mobile m2=new Mobile();
		//error 
		//java compiler did not add any default constructor
		//as already a constructor exists in the class
	}

}
