package designpatterns.abstractorfactory;

public class EquitiesAssetHoldingCalculator extends AbstractAssetHoldingCalculator {

	AssetCalculatorContext context;
	public EquitiesAssetHoldingCalculator(AssetCalculatorContext context) {
		super(context);
		this.context = context;
	}

	@Override
	protected double calculate() {
		//Your Equities asset calculator code here to implement your own business logic.
		return context.getNomialValue()/10000;
	}

}
