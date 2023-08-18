package deafaulterror;

public class Mobile {
	String brand;
	String color;
	int cost;
	
	void allowToTalk()
	{
		System.out.println("calling........");
	}
	void allowToPlay()
	{
		System.out.println("playing.....");
	}
	public Mobile(String x,String y,int z)
	{
		brand=x;
		color=y;
		cost=z;
	}

}
