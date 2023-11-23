package entities;

public class Produtos {

	public String name;
	public double price;
	public int quantity;
	
	public Produtos(String name, double price, int quantity) {
		this.name= name;
		this.price= price;
		this.quantity= quantity;
	}
	
	public Produtos(String name, double price) {
		this.name= name;
		this.price= price;
		
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProduto(int quantity) {
		this.quantity += quantity;
	}

	public void removeProduto(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
