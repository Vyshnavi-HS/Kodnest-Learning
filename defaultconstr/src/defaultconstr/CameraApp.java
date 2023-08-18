package defaultconstr;

public class CameraApp {
	public static void main(String[] args) {
		Camera camera=new Camera();
		camera.captureImage();
		camera.displayImage();
		System.out.println(camera.brand+" "+camera.color+" "+camera.cost);
	}

}
