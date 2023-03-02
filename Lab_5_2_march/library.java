package Lab_5_2_march;
public class library {
	private int bookId;  //instance variable
	private String bookName;   //instance variable
	private String bookAuthor;  //instance variable
	void addBook() {  //method1
		System.out.println("Add new book here :"+bookName);
	}
	void dispanseBook() {  //method1
		System.out.println("DispanseBook");
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
}
