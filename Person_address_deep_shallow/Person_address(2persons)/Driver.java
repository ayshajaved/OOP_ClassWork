public class Driver {
    public static void main(String[] args) {
        Address address1 = new Address("Lahore", "Pakistan");
        Person p1 = new Person("Ayesha", "M.javed", address1);
        p1.displayInfo1();    
        // Address address2 = address1; //shallow copy
        // Person p2 = new Person("Ayesha", "M.javed", address2);
        // p2.displayInfo();
        // System.out.println(address1);
        // System.out.println(address2);//address is same
        // address1.setCountry("India");
        // p1.displayInfo();
        // p2.displayInfo();
        /*we didnot use the copy constructor for copying, but instead use the general method to copy and in this way the reference 
        address is same foe both of the addresses(1,2) and the drawback is that when i change the attribute of one address the other
        address attribute changes on its own.
        */
        Address address3 = new Address(address1); //deep copy   
        Person p3 = new Person("maheen", "Muhammad", address3);
        p3.displayInfo2();
        System.out.println("--------------------");
        // System.out.println(address1);
        // System.out.println(address3);//now the addresses are different, if i change one's attribute, the other won't change
        address3.setCountry2("Paris");
        p3.displayInfo2(); //changed country is printed, the address1 is unchanged!

        /*
         * But this code is only for the 2 persons having changed city and contry
         * For many persons or city, we have to use same attributes of a person 
         * and changing them
         */
    
    }   
}
