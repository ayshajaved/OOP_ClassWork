public class Product{
    //class variables
    private String productName;
    private String productId;
    private double productPrice;
    private static int counter = 0;    
    //instance block
    {
        productId = String.format("%05d",++counter);
        // System.out.println(productId);
        // System.out.println(counter);
        // System.out.println("This is the Instance block!");
    }

    //getters setters
    public void setProductName(String name){
        this.productName = name;
    }
    public void setProductId(String i){
        this.productId = i;
    }
    public void setProductPrice(double p){
        this.productPrice = p;
    }
    public String getProductName(){
        return this.productName;
    }
    public String getProductId(){
        return this.productId;
    }
    public double getProductPrice(){
        return this.productPrice;
    }

    @Override
    public String toString(){
        return String.format("%-15s %s %.2f",productName,productId, productPrice);
    }

    //constructor chaining
    Product(String name,double price){
        this.productName = name;
        this.productPrice = price;
    }
    Product(String name){
        this(name, 0);
    }
    Product(){
        this("default name");
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        else if(obj==null || getClass() != obj.getClass())
            return false;
        else{
            Product temp =(Product)obj;
            return temp.getProductName().equals(this.productName);
        }
    }
}