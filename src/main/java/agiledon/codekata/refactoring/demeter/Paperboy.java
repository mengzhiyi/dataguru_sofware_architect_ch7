package agiledon.codekata.refactoring.demeter;

public class Paperboy {
    
    public void pay(Customer curCustomer, float payment) {
    	try {
			curCustomer.doPay(payment);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
