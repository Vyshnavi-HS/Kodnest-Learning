
public class FanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f1=new Fan();
		Fan f2=new Fan();
		Fan f3=new Fan();
		
		f1.no_Of_Wings=3;
		f1.color="black";
		f1.cost=2000;
		f1.brand="crompton";
		
		f2.no_Of_Wings=4;
		f2.color="brown";
		f2.cost=3000;
		f2.brand="havier";
		
		f3.no_Of_Wings=5;
		f3.color="blue";
		f3.cost=4000;
		f3.brand="atomberg";
		
		System.out.println(f1.no_Of_Wings+" "+f1.color+" "+f1.cost+" "+f1.brand);
		System.out.println(f2.no_Of_Wings+" "+f2.color+" "+f2.cost+" "+f2.brand);
		System.out.println(f3.no_Of_Wings+" "+f3.color+" "+f3.cost+" "+f3.brand);
		
		f1.rotate();
		f1.blow_Air();
		
		f2.rotate();
		f2.blow_Air();
		
		f3.rotate();
		f3.blow_Air();
		

	}

}
