package application;
abstract public class Product implements Comparable <Product> {
	
	private String name;
	private String brand;
	private double price;
	private String productImage;
	
	public Product() {
		name = "Doritos";
		brand = "Frito-Lay";
		price = 1.25;
		productImage = "doritos.png";
	}
	
	public Product(String name, String brand, double price) {
		this.setName(name);
		this.setBrand(brand);
		this.setPrice(price);
		this.setProductImage(productImage);;
	}
	public Product(Product copyProduct) {
		this.setName(copyProduct.getName());
		this.setBrand(copyProduct.getBrand());
		this.setPrice(copyProduct.getPrice());
		this.setProductImage(copyProduct.getProductImage());
	}
	public String getProductImage() {
		return productImage;
	}

	public String getName() {
		return this.name;
	}
	public String getBrand() {
		return this.brand;
	}
	public double getPrice() {
		return this.price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public String toString() {
		return "\n"
		+ getName()
		+"\nPrice; " + getPrice()
		+"\nBrand: " + getBrand();
		
	}
}
