import java.util.ArrayList;
import java.util.List;
public class Company {
    private String company;
    static
    {
        System.out.println("Welcome to the different Products of Companies!!");
    }
    //Arraylist for list of products
    private List<Product> products;
    
    //constructor chaining
    Company(String name,List<Product> products){
        this.company = name;
        this.products = products;
    }
    Company(){
        this("Default company",new ArrayList<>());
    }
    public void setName(String name){
        this.company = name;
    }
    //overriding methods
    @Override
    public String toString(){
        return "Company: "+ company+"!";
    }
    //displaying company
    public void display(){
        System.out.println("The Products of the Company are: \n");
        for(Product p : products){
            System.out.println(p);
        }
    }
    //deep copying company
    @Override 
    public Object clone(){
        return new Company(this.company, products);
    }
    @Override
    public boolean equals(Object ob){//upcasting implicitly Company to Object
        if(this == ob){ 
            return true;
                }
        else if(ob == null || getClass() != ob.getClass()){
            return false;
        }
        else{
            Company c = (Company)ob;//downcasting Object to company
            return this.products.equals(c.products);
        }
    }












}
