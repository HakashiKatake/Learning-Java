

public class Aggre {
    public static void main(String[] args) {
        //agregregation = represents a "has-a" relationsship between objects
        // one obj contains another obj as part of its structure,
        //but contained object/s can exist independtly

        Book book1 = new Book("The fellow of the ring", 423);
        Book book2 = new Book("The two towers", 352);
        Book book3 = new Book("The return of the king", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public lib", 1879, books);
        library.displayInfo();

        
    }
}
