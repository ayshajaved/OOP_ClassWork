import java.util.List;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(); 
        Product p1 = new Product("Laptop", 20000);
        Product p2 = new Product("bag", 2000);
        Product p3 = new Product("shoes");
        Product p4 = new Product();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        // System.out.println(p1);
        // System.out.println(p2);
        // System.out.println(p3);
        // System.out.println(p4);
        Company c1 = new Company("GOOGLE",products);
        
        //First Company Display
        System.out.println(c1);
        c1.display();

        //Second Company Display
        //deep copying
        Company c2 = (Company)c1.clone();
        c2.setName("MICROSOFT");
        System.out.println(c2);
        c2.display();

        //checking if the First and second companies are equal as per products
        if(c2.equals(c1)){
            System.out.println("\nCompanies(1,2) are same! as per products!\n");
        }

        //Second arraylist for Third company
        List<Product> newproducts = new ArrayList<>(); 
        Product p5 = new Product("Spoon", 100);
        Product p6 = new Product("plate", 200);
        Product p7 = new Product();
        newproducts.add(p5);
        newproducts.add(p6);
        newproducts.add(p7);
        Company c3 = new Company("AMAZON",newproducts);
        System.out.println(c3);
        c3.display();
        
        //checking If products are equal
        if(products.equals(newproducts)){
            System.out.println("\nProducts are same!\n");
        }
        else{
            System.out.println("Products are not same!");
        }

        //checking if the Second and third companies are equal as per products
        if(c3.equals(c2)){
            System.out.println("\nCompanies(2,3) are same! as per products!\n");
        }
        else{
            System.out.println("Companies(2,3) are not same!");
        }
    }
}
