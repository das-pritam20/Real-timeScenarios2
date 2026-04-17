import java.util.Scanner;
public class Meesho{
    public static void main(String []args){
    	Scanner sc = new Scanner(System.in);
        String productId = sc.nextLine();
        String productName = sc.nextLine();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        int quantityPromotional = sc.nextInt();
        boolean isPromotional = sc.nextBoolean();

        Product p1 = new Product(productId,productName,price);
        p1.addStock(quantity);
        p1.addStock(quantityPromotional,isPromotional);
        System.out.println(p1.getStockDetails());
    }
}

class Product{
    String productId;
    String productName;
    double price;
    int quantity;
    int quantityPromotional;

    Product(String productId,String productName,double price){
        this.productId = productId;
        this.productName = productName;
        if(price>0){
            this.price = price;
        }
        else{
            System.out.println("The price can not be negative...");
            System.exit(0);
        }
    }

    public void addStock(int quantity){
        if(quantity<0){
            System.out.println("Quantity can not be less than 0...");
            System.exit(0);
        }
        else{
            this.quantity = quantity;
        }
    }

    public void addStock(int quantity, boolean isPromotional){
        if(quantity<0&&(isPromotional==false)){
            System.out.println("Quantity can not be less than 0...");
            System.exit(0);
        }
        else{
            quantityPromotional = quantity;
        }
    }

    public String getStockDetails(){
        return "Stock added: "+quantity+" units"+
        "\nPromotional Stock: "+quantityPromotional+" units added";
    }
}