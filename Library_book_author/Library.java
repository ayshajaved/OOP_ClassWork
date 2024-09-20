public class Library{
//instance attributes
	private String place;
        private Book b1, b2;

//parametrized constructor
Library(String place, Book b1, Book b2){
this.place = place;
this.b1 = b1;
this.b2 = b2;
}

//copy methods getters and setters
public void setPlace(String p){
this.place = p;
}
public String getPlace(){
return this.place;
}
public Book getBook1(){
return b1;
}
public Book getBook2(){
return b2;
}
public Library deepcopy(){
	return new Library(getPlace(),b1.deepcopy(), b2.deepcopy());
}
public Library shallowcopy(){
	return new Library(getPlace(), b1, b2);
}
public void libraryInfo(){
System.out.println("The library is located in: "+getPlace()+" !");
System.out.println("The First book is: "+b1.getTitle()+" of: "+b1.getAuthor().getName()+" having email: "+b1.getAuthor().getEmail());
System.out.println("The Second book is: "+b2.getTitle()+" of: "+b2.getAuthor().getName()+" having email: "+b2.getAuthor().getEmail());
}
}