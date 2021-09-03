package com.java.dao;

import com.java.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {

    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }
    public void addBook(Book addBook){
        for (Book book: bookList){
            if (book.equals(addBook)){
                System.out.println("Book already exists, please re-enter");
                return;
            }
        }
        bookList.add(addBook);
    }
    public void removeBook(Book book){
        bookList.remove(book);
    }
    public void updateBook(Book updatedBook) {
        for (Book book: bookList) {
            if (book.getID() == updatedBook.getID()) {
                book.setReleaseNumber(updatedBook.getReleaseNumber());
                book.setAuthor(updatedBook.getAuthor());
            }
        }
    }

    public Book searchBookID(long ID) {
        for (Book book: bookList) {
            if (book.getID() == ID) {
                return book;
            }
        }
        return null;
    }

}
