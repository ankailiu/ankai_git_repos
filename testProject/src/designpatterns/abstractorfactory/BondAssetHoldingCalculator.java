package designpatterns.abstractorfactory;

public class BondAssetHoldingCalculator extends AbstractAssetHoldingCalculator {
	AssetCalculatorContext context;
	

	public BondAssetHoldingCalculator(AssetCalculatorContext context) {
		super(context);
		this.context = context;
	}

	@Override
	protected double calculate() {
		//Your Bond asset calculator code here to implement your own business logic.
		return context.getNomialValue()/100;
	}

}
