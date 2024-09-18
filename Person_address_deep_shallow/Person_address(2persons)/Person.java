public class Person {
    private String namePerson;
    private String fatherName;
    Address ad1;
    //parametrized constructor
    Person(String n, String fn, Address add){
        this.namePerson = n;
        this.fatherName = fn;
        this.ad1 = add;
    }
    //copy constructor
    Person(Person p){
        this.namePerson = p.getName();
        this.fatherName = p.getFatherName();
        this.ad1 = new Address(p.getAddress());
    }
    //methods
    public String getName(){
        return this.namePerson;
    }
    public String getFatherName(){
        return this.fatherName;
    }
    public Address getAddress(){
        return this.ad1;
    }
    public void displayInfo1(){
        System.out.println("Person's name is: "+getName()+"\n"+"His/Her father name is: "+getFatherName());
        System.out.println("Address includes: "+"City: "+ad1.getCity1()+"\t"+"Country: "+ad1.getCountry1());
    }
    public void displayInfo2(){
        System.out.println("Person's name is: "+getName()+"\n"+"His/Her father name is: "+getFatherName());
        System.out.println("Address includes: "+"City: "+ad1.getCity2()+"\t"+"Country: "+ad1.getCountry2());
    }
}   
