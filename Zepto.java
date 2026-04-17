/*
Scenario 4: Zepto – Order Delivery Tracker
Objective:
Track grocery orders and estimate delivery time.
Question:
Create a class Order.
Use a parameterized constructor to initialize:
orderId (String)
customerName (String)
deliveryTimeInMinutes (int)
Method trackOrder():
Prints delivery status: "Preparing", "Out for Delivery", "Delivered"

Overload trackOrder():
Version 1: No parameters (prints default status)
Version 2: Takes current time in minutes and estimates time left.

Validations:
Delivery time must be between 1 and 30
If time left is <= 0, print "Delivered"

Sample Output:
Order ID: ZP4567
Status: Out for Delivery
ETA: 5 minutes
Order ID: ZP4568
Status: Delivered
*/


import java.util.Scanner;

class Zepto{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String orderId = sc.nextLine();
		String customerName = sc.nextLine();
		int deliveryTimeInMinutes = sc.nextInt();
		int currentTime = sc.nextInt();
		
		Order order1 = new Order(orderId,customerName,deliveryTimeInMinutes);
		System.out.println(order1.trackOrder());
		System.out.println(order1.trackOrder(currentTime));
	}
}

class Order{
	String orderId;
	String customerName;
	int deliveryTimeInMinutes;
	
	Order(String orderId,String customerName,int deliveryTimeInMinutes){
		this.orderId = orderId;
		this.customerName = customerName;
		this.deliveryTimeInMinutes = deliveryTimeInMinutes;
	}
	
	public String trackOrder(){
		if(deliveryTimeInMinutes>20){
			return "Order ID: "+orderId+
				"\nStatus: Preparing..."+
				"\nETA: "+deliveryTimeInMinutes+" minutes\n";
		}

		else if(deliveryTimeInMinutes>0){
			return "Order ID: "+orderId+
				"\nStatus: Out for Delivery..."+
				"\nETA: "+deliveryTimeInMinutes+" minutes\n";
		}
		
		else{
			return "Order ID: "+orderId+
				"\nStatus: Delivered..."+
				"\nETA: "+deliveryTimeInMinutes+" minutes\n";
		}
	}

	public String trackOrder(int currentTime){
		currentTime = Math.abs(currentTime);
		if((deliveryTimeIn)>20){
			return "Order ID: "+orderId+
				"\nStatus: Preparing...\n";
		}

		else if((deliveryTimeInMinutes-currentTime)>0){
			return "Order ID: "+orderId+
				"\nStatus: Out for Delivery...\n";
		}
		
		else{
			return "Order ID: "+orderId+
				"\nStatus: Delivered...\n";
		}
	}
	
}






