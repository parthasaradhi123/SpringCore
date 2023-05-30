package partha.cards;

public class CreditCard implements ICards {

	@Override
	public boolean paymentGateWay(double bill) {
		System.out.println("You have done the payment through Credit Card and the amount is :: "+bill);
		return false;
	}

}
