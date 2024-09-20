public class Book{

//instance attributes
	private String title;
	private Author a;

//parametrized constructor
Book(String title, Author a){
this.title = title;
this.a = a;
}

//copy methods getters and setters
public void setTitle(String t){
	this.title = t;
}
public String getTitle(){
	return this.title;
}
public Author getAuthor(){
	return this.a;
}
public Book deepcopy(){
	return new Book(getTitle(), a.deepcopy());
}
public Book shallowcopy(){
	return new Book(getTitle(), a);
}
public void bookInfo(){
System.out.println("The title of the book is: "+getTitle()+" by"+a.getName());

}







}