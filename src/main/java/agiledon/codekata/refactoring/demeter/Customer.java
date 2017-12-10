package agiledon.codekata.refactoring.demeter;

public class Customer {
	private Name name;
	private Wallet myWallet;
    
	/**
	 * 
	 * @param payment
	 * @throws Exception
	 */
	public void doPay(float payment) throws Exception{
		if (myWallet.getTotalMoney() > payment) {
			myWallet.subtractMoney(payment);
	    } else {
	    	//money not enough
	    	throw new Exception("money not enough");
	    }
	}
}