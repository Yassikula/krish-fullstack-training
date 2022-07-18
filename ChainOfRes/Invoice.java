package ChainOfRes;

public class Invoice {
	
	private int paymentID;
	private double amount;
	private double tax;
	public Invoice(int paymentID, double amount) {
		this.paymentID = paymentID;
		this.amount = amount;
		
	}
	
	public int getPaymentID() {
		return paymentID;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public double getTax() {
		return tax;
	}
	
	protected void setTax(double tax) {
		this.tax = tax;
	}
	
	
	

}
