package thiskeyword;

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
	public Mobile(String brand,String color,int cost)
	{
		this.brand=brand;
		this.color=color;
		this.cost=cost;
	}
}
