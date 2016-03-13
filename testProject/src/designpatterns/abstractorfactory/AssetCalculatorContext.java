package designpatterns.abstractorfactory;

public class AssetCalculatorContext {
	
	private double nomialValue;
	private int assetCategory;
	private String userName;

	public double getNomialValue() {
		return nomialValue;
	}

	public void setNomialValue(double nomialValue) {
		this.nomialValue = nomialValue;
	}

	public int getAssetCategory() {
		return assetCategory;
	}

	public void setAssetCategory(int assetCategory) {
		this.assetCategory = assetCategory;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
