
package overloadingconstructor;

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
	public Mobile()
	{
		brand="Apple";
		color="Gold";
		cost=250000;
	}
	public Mobile(String x)
	{
		brand=x;
		cost=400000;
	}
	public Mobile(int c)
	{
		cost=c;
		color="silver";
		brand="gionee";
	}
	
}
