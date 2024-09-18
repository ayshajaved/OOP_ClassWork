public class Driver_ {
    public static void main(String[] args) {
        Address_ ad1 = new Address_("Lahore", "Pakistan");
        Person_ pe1 = new Person_("Ayesha", "M.javed", ad1);
        pe1.displayInfo();
        Address_ ad2 = new Address_(ad1);
        ad2.setCity("islamabad");
        Person_ pe2 = new Person_("Maheen", "Muhammad", ad2);
        pe2.displayInfo();
        //address 2 is deep copyied from address 1
        //now person 3 is to be copyied from person2
        Person_ pe3 = new Person_(pe2);
        pe3.getAddress().setCity("France");
        pe3.getAddress().setCountry("Paris");
        pe3.setName("Hania");
        pe3.setfName("M.");
        pe3.displayInfo();
    
    }    
}
