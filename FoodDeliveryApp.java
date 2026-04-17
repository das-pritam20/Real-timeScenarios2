/*
Question 1: Food Delivery App (with explicit validations)

You are designing a system for a food delivery app where users can browse and
update food items. Each food item has a name, price, and category (e.g., "Starter",
"Main Course", "Dessert").

Task:

Create a class FoodItem with private fields:
String itemName — stores the name of the food item.
double price — stores the price of the item.
String category — stores the category of the item.

Implement setter methods using the this keyword with validations:
itemName cannot be null or empty. If invalid, print an error message.
category cannot be null or empty. If invalid, print an error message.
price cannot be negative. If invalid, print an error message.
Implement getter methods to retrieve the values of these fields.
Write a main class to:
Create 3 FoodItem objects.
Use setter methods to set their details.
Display the details using getter methods.
Update the price of one food item and print the updated details.
*/


import java.util.Scanner;
class FoodItems{
	Scanner sc = new Scanner(System.in);
	private String itemName;
	private String category;
	private double price;
	
	// ......Setter Methods........
	public void setItemName(String itemName){
		if(itemName.isEmpty() || itemName.equalsIgnoreCase("null")){
			System.err.println("Item Name cannot be null or empty");
			System.exit(0); //Shutting down the JVM forcefully....
		}
		else{
			this.itemName = itemName;
			System.out.println("Item Name successfully set.");
		}
	}

	public void setCategory(String category){
		if(category.isEmpty() || category.equalsIgnoreCase("null")){
			System.err.println("Category cannot be null or empty");
			System.exit(0); //Shutting down the JVM forcefully....

		}
		else{
			this.category = category;
			System.out.println("Category successfully set.");
		}
	}

	public void setPrice(double price){
		if(price < 0){
			System.err.println("Item Price cannot be Negative");
			System.exit(0); //Shutting down the JVM forcefully....

		}
		else{
			this.price = price;
			System.out.println("Item Price successfully set.");
		}
	}


	// ..........Getter Methods..........
	public String getItemName(){
		return "Item Name: "+itemName;
	}

	public String getCategory(){
		return "Category: "+category;
	}

	public String getPrice(){
		return "Item Price: "+price;
	}
	
	public String displayItemDetails(){
		return "Item Name: "+itemName 
			+ "\nCategory: "+category
			+ "\nItem Price: "+price;
	}
}



public class FoodDeliveryApp{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		FoodItems item1 = new FoodItems();
		
		System.out.print("Enter the item name:");
		String itemName = sc.nextLine();
		item1.setItemName(itemName);

		System.out.print("Enter the Category:");
		String category = sc.nextLine();
		item1.setCategory(category);

		System.out.print("Enter the Price of Item:");
		double price = sc.nextDouble();
		item1.setPrice(price);
		
		
		System.out.println(item1.displayItemDetails());
	}
}








