package partha.cards;

public class PaymentGayWayProcess
{
	private ICards payment = null;
	
	public PaymentGayWayProcess(ICards payment)
	{
		this.payment = payment;
	}
	
	public boolean makePayment(double bill)
	{
		return payment.paymentGateWay(bill);
	}
}
