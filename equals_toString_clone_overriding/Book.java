public class Book {
    private String bookTitle;
    private int bookIsbn;
    private Person author;
    Book(String bookTitle, int bookIsbn, Person author){
        this.bookTitle = bookTitle;
        this.bookIsbn = bookIsbn;
        this.author = author;
    }   
    public void setBookTitle(String t)
    {
        this.bookTitle = t;
    }
    public void setBookIsbn(int i){
        this.bookIsbn = i;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public int getBookIsbn(){
        return this.bookIsbn; 
    }
    public Person getAuthor(){
        return this.author;
    }
    ////shallow copy
    // public Book clone(){
    //     return new Book(this.bookTitle, this.bookIsbn, this.author);
    // }

    //deep copy
    //Using user defined method
    // public Book clone(){
    //     return new Book(this.bookTitle, this.bookIsbn, new Person(this.author.getName(), this.author.getEmail()));
    // }
    
    @Override
    public Object clone(){
        return new Book(bookTitle, bookIsbn,(Person)author.clone());//downcasting Person clone returned object to Person
    } 
    @Override
    public String toString(){
        return "The book is"+" "+getBookTitle()+"\tHaving isbn number: "+getBookIsbn();
    }
    @Override
    public boolean equals(Object ob){
        Book temp = (Book)ob; //downcasting explicitly into book
        return this.bookTitle.equals(temp.getBookTitle());
    }






}
