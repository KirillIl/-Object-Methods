public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("It", new Author("Stephen", "King"), 1986 );
        System.out.println(book1);


        Book book2 = new Book("Alice's Adventures in Wonderland", new Author("Lewis", "Carroll"), 1865);
        System.out.println(book2);
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}