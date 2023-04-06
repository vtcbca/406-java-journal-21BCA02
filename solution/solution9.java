package stores;

public class Stock {
    private int itemNo;
    private String itemName;
    private int stockAvailable;
    private double cost;
    
    public Stock(int itemNo, String itemName, int stockAvailable, double cost) {
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.stockAvailable = stockAvailable;
        this.cost = cost;
    }
    
    public int getItemNo() {
        return itemNo;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public int getStockAvailable() {
        return stockAvailable;
    }
    
    public double getCost() {
        return cost;
    }
    
    public void setStockAvailable(int stockAvailable) {
        this.stockAvailable = stockAvailable;
    }
    
    public void addStock(int quantity) {
        this.stockAvailable += quantity;
    }
}

import store.*;
import java.util.ArrayList;
import java.util.Scanner;
public class PRG_04 {

	public static void main(String[] args) {

		ArrayList<stock> items = new ArrayList<stock>();
		items.add(new stock(1, "Apple", 10, 20.0));
		items.add(new stock(2, "Banana", 20, 30.0));
		items.add(new stock(3, "Ball", 30, 40.0));

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nCurrent Stock:");
		for (stock item : items) {
			System.out.println(item);
		}

		System.out.print("\nEnter the item no. to add stock, or 0 to exit:");
		int item_no = scanner.nextInt();
		if (item_no == 0) {
		break;}

		stock item = items.stream().filter(i -> i.getItem_no()==item_no).findFirst().orElse(null);	
		if (item == null) {
			System.out.println("Invalid item no.");
		}
		else {
		System.out.print("\nEnter the quantity to add:");
		int qty = scanner.nextInt();
		item.setStock_available(item.getStock_available() + qty);
		System.out.println("Stock added successfully.");
			}
		}
	}
}

