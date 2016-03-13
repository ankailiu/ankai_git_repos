package designpatterns.abstractorfactory;

public abstract class AbstractAssetHoldingCalculator implements IAssetHoldingCalculator {
	
	private AssetCalculatorContext context = null;
	public AbstractAssetHoldingCalculator(AssetCalculatorContext context){
		this.context = context;
	}
	
	protected abstract double calculate();

	@Override
	public AssetCalculationResult getAssetCalculationResult(int assetCategory) {
		AssetCalculationResult result = new AssetCalculationResult();
		result.setAssetCategory(assetCategory);
		result.setAssetHolding(calculate());
		if(assetCategory == 1){
			result.setAssetCategoryName("Cash");
		}else if(assetCategory == 2){
			result.setAssetCategoryName("Bond");
		}else{
			result.setAssetCategoryName("Equities");
		}
		result.setUserName(context.getUserName());
		return result;
	}

}
