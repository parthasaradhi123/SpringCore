package partha.cards;

public class DebitCardPay implements IPay {

	public boolean doPayment(double bill) 
	{
		System.out.println("Payment is done through Debit Card :: "+bill);

 		return true;
	}

}
