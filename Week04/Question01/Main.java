package Week04.Question01;
// Manages book details - demonstrates constructor and method overloading
// initializes only title and author
// initializes title, author and ISBN
// initializes all attributes
// returns all book details
// returns details of book matching given ISBN
class Book{
     String title;
     String author;
     String ISBN;
     double price;

     Book(String title,String auther){
         this.title = title;
         this.author = auther;
     }
     Book(String title,String auther,String ISBN){
         this.title = title;
         this.author = auther;
         this.ISBN = ISBN;
     }
    Book(String title,String auther,String ISBN,double price){
        this.title = title;
        this.author = auther;
        this.ISBN = ISBN;
        this.price = price;
    }
    void getBookDetails(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + ISBN);
        System.out.println("Price : " + price);
        System.out.println();

    }
    void getBookDetails(String ISBN){
         if(this.ISBN != null && this.ISBN.equals(ISBN)){
             System.out.println("Book Found");
             System.out.println("Title : " + title);
             System.out.println("Author : " + author);
             System.out.println("ISBN : " + this.ISBN);
             System.out.println("Price : " + price);
         }else{
             System.out.println("Book not found with ISBN: " + ISBN);
         }
        System.out.println();
         }

    }

public class Main {
    public static void main(String[]args){
     Book b1 = new Book("Java Basics", "James");

     Book b2 = new Book("OOP Concepts", "John", "ISBN101");

     Book b3 = new Book("Database Systems", "David", "ISBN202", 2500.00);

     b1.getBookDetails();

     b2.getBookDetails();

     b3.getBookDetails();

     b3.getBookDetails("ISBN202");
    }
}
