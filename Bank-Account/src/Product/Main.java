package Product;

public class Main {
    public static void main(String[] args) {
        Product Rice = new Product("Rice", 4, 2);
        System.out.println(Rice);
        Rice.totalCost();


        Product Beans = new Product("Beans", 10, 4);
        System.out.println(Beans);
        Beans.totalCost();


    }

}
