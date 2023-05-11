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

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public void totalCost(){
        double total;
        total = this.quantity * this.cost;
        System.out.println("The total cost is " + total);
    }

    @Override public String toString(){
        return "1 lb of " + getProductName() + " costs " +  getCost() + " and " + getQuantity() + " lbs were purchased. ";
    }

}
