package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Produtos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
			
		Produtos produto = new Produtos(name, price);
		
		System.out.println();
		System.out.println("Product data: " + produto);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		produto.addProduto(quantity);
		System.out.println();
		System.out.println("Updated data: " + produto);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		produto.removeProduto(quantity);
		System.out.println();
		System.out.println("Updated data: " + produto);
		sc.close();
	}

}
