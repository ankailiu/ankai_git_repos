package designpatterns.abstractorfactory;

public class CashAssetHoldingCalculator extends AbstractAssetHoldingCalculator {

	AssetCalculatorContext context;
	public CashAssetHoldingCalculator(AssetCalculatorContext context) {
		super(context);
		this.context = context;
	}

	@Override
	protected double calculate() {
		//Your Cash asset calculator code here to implement your own business logic.
		return context.getNomialValue();
	}

}
