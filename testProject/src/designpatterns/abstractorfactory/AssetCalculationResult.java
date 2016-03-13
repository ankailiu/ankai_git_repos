package designpatterns.abstractorfactory;

import java.io.Serializable;

public class AssetCalculationResult implements Serializable {
	
	private double assetHolding;
	
	private int assetCategory;
	
	private String assetCategoryName;
	
	private String userName;
	

	public double getAssetHolding() {
		return assetHolding;
	}

	public void setAssetHolding(double assetHolding) {
		this.assetHolding = assetHolding;
	}

	public int getAssetCategory() {
		return assetCategory;
	}

	public void setAssetCategory(int assetCategory) {
		this.assetCategory = assetCategory;
	}

	public String getAssetCategoryName() {
		return assetCategoryName;
	}

	public void setAssetCategoryName(String assetCategoryName) {
		this.assetCategoryName = assetCategoryName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
