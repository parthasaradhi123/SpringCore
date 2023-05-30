package partha.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import partha.cards.AmexCard;
import partha.cards.CreditCardPay;
import partha.cards.DebitCardPay;
import partha.cards.PaymentProcessing;

public class MainAPP {

	public static void main(String[] args) 
	{
		ApplicationContext factory = new ClassPathXmlApplicationContext("Beans.xml");
		
		factory.getBean("credit", CreditCardPay.class);
		factory.getBean("debit", DebitCardPay.class);
		factory.getBean("amex", AmexCard.class);
		
		PaymentProcessing pp = factory.getBean("payment",PaymentProcessing.class);

		pp.doPayment(100.90 );
		
		
	}
	

}
