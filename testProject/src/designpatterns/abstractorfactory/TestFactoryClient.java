package designpatterns.abstractorfactory;

/**
 * Better to work with OCP principle to understand the factory pattern.
 * There are three types of asset calculator (Cash,Bond,Equities), 
 * Each assets calculator has its own implementation and algorithm.
 * 
 * If Cash calculator business logic need to be changed,just need to change in the CashAssetHoldingCalculator,
 * Don't touch the other two calculators, Bond&Equities calculator will not effected. 
 * 
 * @author Ankai Liu
 *
 */
public class TestFactoryClient {
	
	public static void main(String [] args){
		AssetCalculatorContext context = new AssetCalculatorContext();
		context.setNomialValue(1000000);
		context.setUserName("Ankai Liu");
		
		context.setAssetCategory(1);
		IAssetHoldingCalculator cashCalculator = AssetCalculatorFactory.calculateAssetByCategory(context);
		AssetCalculationResult cashCalculatorResult = cashCalculator.getAssetCalculationResult(1);
		System.out.println("Asset Name:"+cashCalculatorResult.getAssetCategoryName() 
				+ " \t   Asset Holding Value" + cashCalculatorResult.getAssetHolding()
				+ " \t   Changedby:" + cashCalculatorResult.getUserName());
		
		context.setAssetCategory(2);
		IAssetHoldingCalculator bondCalculator = AssetCalculatorFactory.calculateAssetByCategory(context);
		AssetCalculationResult bondCalculatorResult = bondCalculator.getAssetCalculationResult(2);
		System.out.println("Asset Name:"+bondCalculatorResult.getAssetCategoryName() 
				+ " \t   Asset Holding Value" + bondCalculatorResult.getAssetHolding()
				+ " \t   Changedby:" + bondCalculatorResult.getUserName());
		
		context.setAssetCategory(3);
		IAssetHoldingCalculator equitiesCalculator = AssetCalculatorFactory.calculateAssetByCategory(context);
		AssetCalculationResult equitiesCalculatorResult = equitiesCalculator.getAssetCalculationResult(3);
		System.out.println("Asset Name:"+equitiesCalculatorResult.getAssetCategoryName() 
				+ " \t   Asset Holding Value" + equitiesCalculatorResult.getAssetHolding()
				+ " \t   Changedby:" + equitiesCalculatorResult.getUserName());
		
	}

}
