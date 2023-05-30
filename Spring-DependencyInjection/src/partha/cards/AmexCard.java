package partha.cards;

public class AmexCard implements ICards {

	@Override
	public boolean paymentGateWay(double bill) {
		System.out.println("You have done the payment through Amex Card and the amount is :: "+bill);
		return false;
	}

}
