/*
Scenario 1:
Imagine you are building a very simple version of an e-commerce system.
Each customer can place an order for just one item at a time (we'll keep
it simple — no lists yet!). The order includes:
The item’s name
The item’s price
The quantity
The delivery address
The payment method
Now, the user wants to place the same order again, but with a new delivery
address and a different payment method.

You must use a copy constructor to duplicate the original order so that the
item details remain the same, but the new order can have different address
and payment info.

Your Task
Create a class called Order with the following fields:
String itemName
double itemPrice
int quantity
String deliveryAddress
String paymentMethod

Write two constructors in the Order class:
A regular constructor to create a new order.
A copy constructor that copies all the item-related fields from another
Order object, but lets the user change the deliveryAddress and paymentMethod.

In your main method:
Create an original order with any values you like.
Create a second order using the copy constructor, changing only the deliveryAddress
and paymentMethod.

Print both orders to show that:
The item details are the same
The addresses and payment methods are different

Learning Goals
Understand how a copy constructor works.
Learn how to duplicate an object while modifying certain values.
Avoid changing the original object when creating a new one based on it.

Expected Output Example
Original Order:
Item: Laptop
Price: Rs. 1000.0
Quantity: 1
Delivery Address: 123 Elm Street
Payment Method: Credit Card
------------------------------
Reordered (Copied) Order:
Item: Laptop
Price: $1000.0
Quantity: 1
Delivery Address: 456 Oak Avenue
Payment Method: PayPal
*/


import java.util.Scanner;

public class OrderMain{
	public static void main(String []args){
		Order order1 = new Order("Laptop", 1000, 2, "Naresh IT, Ameerpet, Hyderabad", "Credit Card");
		Order order2 = new Order(order1, "Balaji Guest House, Banjara Hills, Hyderabad", "Google Pay");
		
		System.out.println("\nOriginal Order:"+order1.displayOrderDetails());
		System.out.println("-------------------------------------------------");
		System.out.println("\nReordered (Copied) Order:"+order2.displayOrderDetails());
	}
}

class Order{
	String itemName;
	double itemPrice;
	int quantity;
	String deliveryAddress;
	String paymentMethod;

	Order(String itemName,double itemPrice,int quantity,String deliveryAddress,String paymentMethod){
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.deliveryAddress = deliveryAddress;
		this.paymentMethod = paymentMethod;
	}
	
	Order(Order order, String deliveryAddress, String paymentMethod){
		this.itemName = order.itemName;
		this.itemPrice = order.itemPrice;
		this.quantity = order.quantity;
		this.deliveryAddress = deliveryAddress;
		this.paymentMethod = paymentMethod;
	}
	
	public String displayOrderDetails(){
		return "\nItem: "+itemName+
			"\nPrice: $"+itemPrice+
			"\nQuantity: "+quantity+
			"\nDelivery Address: "+deliveryAddress+
			"\nPayment Method: "+paymentMethod;
	}
}





