package designpatterns.builder;

public class AcerBuilder implements Builder {
	Product product = new AcerProduct();
	
	@Override
	public void buildCPU() {
		product.add("Acer CPU");
	}

	@Override
	public void buildMemory() {
		product.add("Acer Memory");
	}

	@Override
	public Product getProduct() {
		return product;
	}
	
	

}
