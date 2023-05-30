package partha.cards;

public class CreditCardPay implements IPay {

	public boolean doPayment(double bill) 
	{
		System.out.println("Payment is done through Credit Card :: "+bill);
 		
		return true;
	}

}
