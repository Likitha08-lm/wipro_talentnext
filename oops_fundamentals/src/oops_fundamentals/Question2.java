package oops_fundamentals;


	class Author {
	     String name;
	    String email;
	    char gender;
	    public void setAuthor(String name, String email, char gender) {
	        this.name = name;
	        this.email = email;
	        this.gender = gender;
	    }
	    public String getName() {
	        return name;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public char getGender() {
	        return gender;
	    }
	    public void printAuthorDetails() {
	        System.out.println("Author Details:");
	        System.out.println("Name   : " + getName());
	        System.out.println("Email  : " + getEmail());
	        System.out.println("Gender : " + getGender());
	    }
	}
	class Book {
	    String name;
	    String author;
	   double price;
	     int qtyInStock;
	    public void setBook(String name, String author, double price, int qtyInStock) {
	        this.name = name;
	        this.author = author;
	        this.price = price;
	        this.qtyInStock = qtyInStock;
	    }
	    public String getName() {
	        return name;
	    }
	    public String getAuthor() {
	        return author;
	    }
	    public double getPrice() {
	        return price;
	    }
	    public int getQtyInStock() {
	        return qtyInStock;
	    }
	   
	    public void printBookDetails() {
	        System.out.println("Book Details:");
	        System.out.println("Title       : " + getName());
	        System.out.println("Author"+getAuthor());
	        System.out.println("Price       : ₹" + getPrice());
	        System.out.println("Qty In Stock: " + getQtyInStock());
	        System.out.println(); 
	    }
	}
	public class Question2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author();
		author.setAuthor("Dr. APJ Abdul Kalam", "apj@example.com",'M');
	    author.printAuthorDetails();
          Book book = new Book();
          book.setBook("Wings of Fire", "author", 450.0, 200);
          book.printBookDetails();	
	
	}
}
