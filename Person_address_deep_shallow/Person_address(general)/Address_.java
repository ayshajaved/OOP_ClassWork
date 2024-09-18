public class Address_{
    private String city;
    private String country;
    //parametrized constructor
    Address_(String city, String country){
        this.city = city;
        this.country = country;
    }
    //copy constructor
    Address_(Address_ address){
        this.city = address.getCity();
        this.country = address.getCountry();
    }
    //methods
    String getCity(){
        return this.city;
    }
    String getCountry(){
        return this.country;
    }
    void setCity(String c1){
        this.city = c1;
    }
    void setCountry(String c){
        this.country= c;
    }
}