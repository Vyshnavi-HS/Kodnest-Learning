
public class DemoApp {
	public double calculateTotalWithTax(double purchaseAmount,double taxRate)
	{
		double taxAmount=purchaseAmount*taxRate;
		return taxAmount+purchaseAmount;
	}

}
