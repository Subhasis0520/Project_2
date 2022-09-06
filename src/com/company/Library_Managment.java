package com.company;

import java.util.ArrayList;

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }

}
public class Library_Managment {
    public static void main(String[] args) {

        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Anand Math", "Bankimchandra Chattopadhyay");
        bk.add(b1);

        Book b2 = new Book("Time Machine", "H.G. Wells");
        bk.add(b2);

        Book b3 = new Book("Bisarjan", "R.N.Tagore");
        bk.add(b3);

        Book b4 = new Book("The Merchant of Venice", "Shakespeare");
        bk.add(b4);
        Library l = new Library(bk);
        l.addBook(new Book("Shakuntala", " Kalidas"));
        System.out.println(l.books);
        l.issueBook(b3, "Sayan");
        System.out.println(l.books);


    }
}
