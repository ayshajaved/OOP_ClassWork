public class Driver{
    public static void main(String args[]){
    Person author = new Person("Ayesha", "ayesha@email.com");
    Book b1 = new Book("Abe hayat", 123233333, author);
    // System.out.println(b1);
    System.out.println(b1.toString());//same output as above
    
    //calling tostring of author
    System.out.println(author);

    Book b2 = (Book)b1.clone();//deep copying and downcasting object to book because the clone() method is returning Object
    System.out.println(b2);
    System.out.println(b2.getAuthor());
    b2.setBookTitle("peer-e-kamil");
    b2.getAuthor().setName("Maheen");
    System.out.println("\nPrinting b2 after changing title: \n");
    System.out.println(b1);
    System.out.println(author);
    System.out.println(b2);
    System.out.println(b2.getAuthor());
    if(b1.equals(b2)){
        System.out.println("Books are equal as their title is same");
    }
    else{
        System.out.println("Books are not equal as their titles are not same!");
    }

    //As the title are differenet so else conditions will be runned
    //if i comment the setName() method above and then check, if statement will be executed

    
    
    
    
    
    
    
    
    
    
    }
}