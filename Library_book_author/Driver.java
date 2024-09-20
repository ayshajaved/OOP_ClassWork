public class Driver{
    public static void main(String[] args) {
        
    
Author a1 = new Author("Ayesha", "ayesha@email.com");
Book b1 = new Book("Abe-hayat", a1);

//Deep copying
Book b2 = b1.deepcopy();
//b1.bookInfo();
//b2.bookInfo();
//b1.setTitle("Peer-e-kamil");
//b1.getAuthor().setName("Maheen");
//b1.bookInfo();
//b2.bookInfo();

//now shallow copying book
//Book b3 = b1.shallowcopy();
//b3.getAuthor().setName("Muhammad");
//b1.bookInfo();
//b3.bookInfo();//now the nested attribute of b3 changes and it direct affects on b1 bcz they are shallow copied

//creating libraries by deep and shallow methods
Library library = new Library("Lahore", b1,b2);
library.libraryInfo();

//shallow copying library
Library librarycopy = library.shallowcopy();
librarycopy.libraryInfo();
//as i have shallow copied, so when i change the author of one book, second will be changed
library.getBook1().getAuthor().setName("Maheen");
System.out.println("\nThe First book author of both libraries will be changed!!\n");
library.libraryInfo();
librarycopy.libraryInfo();

//deep copying library
Library librarydcopy = library.deepcopy();

//as i have deep copied, so when i change the author of one book, second will not be changed
librarydcopy.getBook2().getAuthor().setName("Muhammad");
System.out.println("\nThe second book author of deepcopied second library will be changed!!\n");
library.libraryInfo();
librarydcopy.libraryInfo();

}
}