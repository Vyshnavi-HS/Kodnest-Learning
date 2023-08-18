package constr;

public class Camera {
	String brand;
	String color;
	int cost;
	void captureImage() {
		System.out.println(brand+" "+color+" "+ "camera capturing.....");
	}
	void displayImage() {
		System.out.println(brand+" "+color+" "+"displaying....");
	}
	public Camera(String x,String y,int z )
	{
		brand=x;
		color=y;
		cost=z;
	}
	

}
