package partha.main;

import partha.cards.AmexCard;
import partha.cards.CreditCard;
import partha.cards.DebitCard;
import partha.cards.PaymentGayWayProcess;

public class Main 
{
	public static void main(String[] args)
	{
		PaymentGayWayProcess p = new PaymentGayWayProcess(new AmexCard());
		p.makePayment(100);
	
	}
	 
}
