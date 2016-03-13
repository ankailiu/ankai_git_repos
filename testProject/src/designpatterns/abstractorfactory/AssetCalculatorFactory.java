package designpatterns.abstractorfactory;

public class AssetCalculatorFactory {
	
	public static IAssetHoldingCalculator calculateAssetByCategory(AssetCalculatorContext context){
		IAssetHoldingCalculator builder = null;
		switch(context.getAssetCategory()){
			case 1:
				builder = new CashAssetHoldingCalculator(context);
				break;
			
			case 2:
				builder = new BondAssetHoldingCalculator(context);
				break;
				
			case 3:
				builder = new EquitiesAssetHoldingCalculator(context);
				break;
		}
		return builder;
	}

}
