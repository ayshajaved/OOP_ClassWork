class Author{
//instance attributes
	private String name;
	private String email;

//parametrized constructor
Author(String name, String email){
this.name = name;
this.email = email;
}

//copy methods and getters setters
public Author deepcopy(){
	return new Author(getName(),getEmail());
}
public void setName(String name){
	this.name = name;
}
public void setEmail(String email){
	this.email = email;
}
public String getName(){
	return this.name;
}
public String getEmail(){
	return this.email;
}
public void authorInfo(){
System.out.println(getName()+"is the Author having email: "+getEmail());

}
}