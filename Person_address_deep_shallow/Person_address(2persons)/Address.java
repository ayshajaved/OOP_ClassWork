public class Address{
    private String city1, city2;
    private String country1, country2;
    //parametrized constructor
    Address(String city, String country){
        this.city1 = city;
        this.country1 = country;
    }
    //copy constructor
    Address(Address address){
        this.city2 = address.getCity1();
        this.country2 = address.getCountry1();
    }
    //methods
    String getCity1(){
        return this.city1;
    }
    String getCountry1(){
        return this.country1;
    }
    String getCity2(){
        return this.city2;
    }
    String getCountry2(){
        return this.country2;
    }
    void setCity1(String c1){
        this.city1 = c1;
    }
    void setCountry1(String c){
        this.country1= c;
    }
    void setCity2(String c2){
        this.city2 = c2;
    }
    void setCountry2(String c_){
        this.country2= c_;
    }
}