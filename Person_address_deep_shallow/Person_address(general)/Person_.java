public class Person_ {
    private String namePerson;
    private String fatherName;
    Address_ ad1;
    //parametrized constructor
    Person_(String n, String fn, Address_ add){
        this.namePerson = n;
        this.fatherName = fn;
        this.ad1 = add;
    }
    //copy constructor
    Person_(Person_ p){
        this.namePerson = p.getName();
        this.fatherName = p.getFatherName();
        this.ad1 = new Address_(p.getAddress());
    }
    //methods
    public String getName(){
        return this.namePerson;
    }
    public void setName(String n){
        this.namePerson = n;
    }
    public String getFatherName(){
        return this.fatherName;
    }
    public void setfName(String fn){
        this.fatherName = fn;
    }
    public Address_ getAddress(){
        return this.ad1;
    }
    public void displayInfo(){
        System.out.println("Person's name is: "+getName()+"\n"+"His/Her father name is: "+getFatherName());
        System.out.println("Address includes: "+"City: "+ad1.getCity()+"\t"+"Country: "+ad1.getCountry());
    }
}   
