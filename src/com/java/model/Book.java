package com.java.model;

import java.util.Comparator;
import java.util.Objects;

public class Book extends Document{
    private String author;
    private int page;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    @Override
    public String toString (){
        return "{ ID: "+ID+" ,producer: "+producer+" ,release: "+releaseNumber
                +" ,author: "+author+ " ,page: "+page+", cost: "+calcualateCost()+ " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return page == book.page && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, page);
    }

    @Override
    public double calcualateCost() {
        return page * 500;
    }


    public static class SortBookNumberRelease implements Comparator<Book>{
        @Override
        public int compare(Book o1, Book o2){
            return o1.getReleaseNumber() - o2.getReleaseNumber();
        }
    }
    public static class SortBookAmount implements Comparator<Book>{
        @Override
        public int compare(Book o1, Book o2){
            return o1.getPage() - o2.getPage();
        }
    }
}
