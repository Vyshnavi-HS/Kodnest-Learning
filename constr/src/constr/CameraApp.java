package constr;

public class CameraApp {

	public static void main(String[] args) {
		Camera camera=new Camera("cannon","black",35000);
		camera.captureImage();
		camera.displayImage();
		System.out.println(camera.brand+" "+camera.color+" "+camera.cost);
		Camera camera1=new Camera("sony","blue",45000);
		camera1.captureImage();
		camera1.displayImage();
		System.out.println(camera1.brand+" "+camera1.color+" "+camera1.cost);
	}

}
