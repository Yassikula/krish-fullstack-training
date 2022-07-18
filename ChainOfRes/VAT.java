package ChainOfRes;

public class VAT extends Handler {
	
	 @Override
	    public double applyTax(Invoice invoice) {
	        invoice.setTax(invoice.getTax() + invoice.getAmount() * 0.01);
	        System.out.println("Vat Calculated");
	        if (invoice.getAmount() <= 100) {
	            return invoice.getTax();
	        } else {
	            return successor.applyTax(invoice);
	        }
	    }
}


