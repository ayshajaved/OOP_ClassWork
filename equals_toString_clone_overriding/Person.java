public class Person {
    private String name;
    private String email;
    Person(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String toString(){
        return "The book Author is"+" "+getName()+"\tIhe author email is "+getEmail();
    }
    @Override
    public Object clone(){
        return new Person(getName(),getEmail());
    }

}
