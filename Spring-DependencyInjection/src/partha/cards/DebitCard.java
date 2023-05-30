package partha.cards;

public class DebitCard implements ICards {

	@Override
	public boolean paymentGateWay(double bill) {
 
		System.out.println("You have done the payment through Debit Card and the amount is :: "+bill);

		return false;
	}

}
