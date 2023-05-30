package partha.cards;

public class AmexCard implements IPay {

	public boolean doPayment(double bill) 
	{
		System.out.println("Payment is done through Amex Card :: "+bill);
 		return true;
	}

}
