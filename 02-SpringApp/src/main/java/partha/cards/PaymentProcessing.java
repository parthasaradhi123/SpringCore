package partha.cards;

public class PaymentProcessing 
{
	private IPay pay =null;
	
	public void setPay(IPay pay)
	{
		this.pay = pay;
	}
	
	public void doPayment(double bill)
	{
		boolean paymentDone = pay.doPayment(bill);
		if(paymentDone)
		{
			System.out.println("Payment is successfull");
		}
		else
		{
			System.out.println("Payment is failed.");
		}
	}
}
