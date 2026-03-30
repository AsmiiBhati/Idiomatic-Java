public class Aggregation
{
    public static void main(String[] args)
    {
        //Aggregation = represents "has a" relationship between objects.
        //One object contains another object as part of its structure, but the contained objects can exist independently.
        Book book1 = new Book("Alice in Wonderland",120);
        Book book2 = new Book("Hamlet",125);
        Book book3 = new Book("Adventures of Tom Sawyer",210);

        Book[] books = {book1,book2,book3};

        for(Book book : books)
        {
            System.out.println(book.displayInfo());     
        }

        Library library = new Library("Central Library",2001,books);
        library.DisplayInfo();
    }
}
class Book
{
    String title;
    int pages;

    Book(String title,int pages)
    {
        this.title = title;
        this.pages = pages;
    }

    String displayInfo()
    {
        return title +" *" + pages + " pages*";
    }
}
class Library
{
    String name;
    int yearEst;
    Book[] books;

    Library(String name,int yearEst,Book[] books)
    {
        this.name = name;
        this.yearEst = yearEst;
        this.books = books;
    }
    void DisplayInfo()
    {
        System.out.println(name + " " + yearEst);
        System.out.println("Books Stock:");
        for(Book book : books)
        {
            System.out.println(book.displayInfo());
        }
    }
}