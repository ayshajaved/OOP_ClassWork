public class ArrayDriver {
    public static void main(String[] args) {
        //Using Array for products
        Product products [] = new Product[5];
        for(int i = 0; i< products.length; i++){
            products[i] = new Product("laptop");
        }
        System.out.println("Initialzation of all the prducts with default values!");
        for(int i = 0; i< products.length; i++){
            System.out.println(products[i]);
        }
        products[1].setProductName("Desktop");
        products[2].setProductName("monitor");
        products[3].setProductName("keyboard");
        products[4].setProductName("mouse");
        products[1].setProductPrice(23000);
        products[2].setProductPrice(10000);
        products[3].setProductPrice(5000);
        products[4].setProductPrice(2000);

        System.out.println("Names and Prices are being set!");
        for(int i = 0; i< products.length; i++){
            System.out.println(products[i]);
        }
    }
}
