package Lab_5_2_march;
public class Main {
public static void main(String[] args) {   //amin method
	library m=new library();   //object
	m.setBookId(101);    //setting value in bookId
	m.setBookName("Java");   //setting value in BookName
	m.setBookAuthor("Thakur Publication");    //setting value in AuthorName
	System.out.println("Book ID is: "+m.getBookId());  //getting the value of bookId
	System.out.println("Name of Book is: "+m.getBookName()); //getting the value of BookName
	System.out.println("Author Name is: "+m.getBookAuthor()); //getting the value of AuthorName
    m.addBook();
    m.dispanseBook();
    }
}
