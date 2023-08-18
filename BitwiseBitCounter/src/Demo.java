import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer:");
    int num = scanner.nextInt();

    int numSetBits = DemoApp.countSetBits(num);
    System.out.println("Number of set bits: " + numSetBits);
}

}
