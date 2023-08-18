package thiskeyword;

public class MobileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1=new Mobile("samsung","purple",125000);
		System.out.println(m1.brand+" "+m1.color+" "+m1.cost);
		m1.allowToTalk();
		m1.allowToPlay();

	}

}
