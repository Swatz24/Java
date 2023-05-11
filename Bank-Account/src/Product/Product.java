package Product;

public class Product {
    private String productName;
    private int quantity;
    private double cost;


    public Product(String  productName, int quantity, double cost){
        this.productName = productName;
        this.quantity = quantity;
        this.cost = cost;
    }

    public void totalCost(){
        double total;
        total = this.quantity * this.cost;
        System.out.println("The total cost is " + total);
    }

    @Override public String toString(){
        return "1 lb of " + this.productName + " costs " +  this.cost + " and " + this.quantity + " lbs were purchased. ";
    }

}
