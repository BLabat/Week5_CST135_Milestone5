package application;

import java.util.ArrayList;
import java.util.Collections;

public class Dispenser {

	private int numberOfProducts;
	ArrayList<Product> productsArray = new ArrayList<Product>();
	ArrayList<Product> drinksArray = new ArrayList<Product>();
	ArrayList<Product> candyArray = new ArrayList<Product>();
	ArrayList<Product> chipsArray = new ArrayList<Product>();
	ArrayList<Product> gumArray = new ArrayList<Product>();
		
	public void displayProducts() {
		for(Product i : productsArray) {
			System.out.println(i);
		}
	}
	
	public int getNumberOfDrinks() {
		int index = 0;
		for (int i = 0; i < productsArray.size(); i++) { // start of loop
			if(productsArray.get(i) instanceof Drinks) {
				index = index + 1;
			}
		} // End of For Loop
		return index;
	}
	
	public int getNumberOfChips() {
		int index = 0;
		for (int i = 0; i < productsArray.size(); i++) { // start of loop
			if(productsArray.get(i) instanceof Chips) {
				index = index + 1;
			}
		} // End of For Loop
		return index;
	}
	
	public int getNumberOfCandy() {
		int index = 0;
		for (int i = 0; i < productsArray.size(); i++) { // start of loop
			if(productsArray.get(i) instanceof Candy) {
				index = index + 1;
			}
		} // End of For Loop
		return index;
	}
	
	public int getNumberOfGum() {
		int index = 0;
		for (int i = 0; i < productsArray.size(); i++) { // start of loop
			if(productsArray.get(i) instanceof Gum) {
				index = index + 1;
			}
		} // End of For Loop
		return index;
	}

	public ArrayList getDrinks() {
		for (int i = 0; i < productsArray.size(); i++) { // start of loop
			if(productsArray.get(i) instanceof Drinks) {
				drinksArray.add(productsArray.get(i));
			}
		} // End of For Loop
		return drinksArray;
	}
	
	public ArrayList getChips() {
		for (int i = 0; i < productsArray.size(); i++) { // start of loop
			if(productsArray.get(i) instanceof Chips) {
				chipsArray.add(productsArray.get(i));
			}
		} // End of For Loop
		return chipsArray;
	}
	
	public ArrayList getCandy() {
		for (int i = 0; i < productsArray.size(); i++) { // start of loop
			if(productsArray.get(i) instanceof Candy) {
				candyArray.add(productsArray.get(i));
			}
		} // End of For Loop
		return candyArray;
	}
	
	public ArrayList getGum() {
		for (int i = 0; i < productsArray.size(); i++) { // start of loop
			if(productsArray.get(i) instanceof Gum) {
				gumArray.add(productsArray.get(i));
			}
		} // End of For Loop
		return gumArray;
	}
	
	public void replaceProduct(Product product, int index) {
		productsArray.set(index,  product);
	}
	
	public void sortProducts() {
		Collections.sort(productsArray);
	}
	
	public void addProduct(Product product) {// Start of addProducts method
		productsArray.add(product);
	} // End of addProducts method
	
	public void removeProduct(int index) {// Start of addProducts method
		productsArray.remove(index);
	} // End of addProducts method
	
	public ArrayList<Product> getProducts() {// Start of getProducts method
		return productsArray;
	} // End of getProducts method
	
	public int getNumberOfProducts() { // Start of getNumberOfProducts method
		return productsArray.size();
	} // End of getNumberOfProducts method

	public Dispenser() {

		// Create Products to store in the dispenser
		Product drink1 = new Drinks("Pepsi Co.", "Pepsi",12);
		Product drink2 = new Drinks("Pepsi Co.", "Mountain Dew",12);
		Product drink3 = new Drinks("Pepsi Co.", "Dr. Pepper",12);
		Product drink4 = new Drinks("Pepsi Co.", "Sierra Mist",12);
		
		Product candy1 = new Candy("Mars, Inc.", "M&M",3.0);
		Product candy2 = new Candy("Mars, Inc.", "KitKat",3.0);
		Product candy3 = new Candy("Nestle", "Crunch",3.0);
		Product candy4 = new Candy("Mars, Inc.", "Twix",3.0);
		
		Product chips1 = new Chips("Frito Lay", "Classic Lays",1.0);
		Product chips2 = new Chips("Frito Lay", "Flamin'Hot Lays",1.0);
		Product chips3 = new Chips("Frito Lay", "Crunchy Cheetos",1.0);
		Product chips4 = new Chips("Frito Lay", "Flamin;Hot Cheetos",1.0);
		
		Product gum1 = new Gum("Wrigley", "Juicy Fruit",0.25);
		Product gum2 = new Gum("Wrigley", "Doublement",0.25);
		Product gum3 = new Gum("Wrigley", "Big Red",0.25);
		Product gum4 = new Gum("Wrigley", "Bubble Yum Cotton Candy",0.25);
		
		//add products strings to dispenser
		this.addProduct(drink1);
		this.addProduct(drink2);
		this.addProduct(drink3);
		this.addProduct(drink4);
		this.addProduct(candy1);
		this.addProduct(candy2);
		this.addProduct(candy3);
		this.addProduct(candy4);
		this.addProduct(chips1);
		this.addProduct(chips2);
		this.addProduct(chips3);
		this.addProduct(chips4);
		this.addProduct(gum1);
		this.addProduct(gum2);
		this.addProduct(gum3);
		this.addProduct(gum4);
		
	} // End of dispenser constructor
	
	// toString Method
	@Override
	public String toString() { // Start of toString Method
		return productsArray.toString();
	} // End of toString method
			
} // End of Dispenser Class


