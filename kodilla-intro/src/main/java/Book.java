public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

// statyczna metoda 'of' do tworzenia instancji Book
    public static Book of(String author, String title) {
        return new Book(author, title);
    }
    public String toString() {
        return "author= \"" + author + "\" " + "title= \"" + title + "\"";
    }
    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book);

    }

}

//Tworzenie własnych klas z metodą 'of'