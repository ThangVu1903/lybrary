package com.java.main;

import com.java.dao.BookManagement;
import com.java.dao.MagazineManagement;
import com.java.dao.NewspaperManagement;
import com.java.model.Book;
import com.java.model.Magazine;
import com.java.model.Newspaper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement();
        List<Book> bookList = bookManagement.getBookList();
        MagazineManagement magazineManagement = new MagazineManagement();
        List<Magazine> magazineList = magazineManagement.getMagazineList();
        NewspaperManagement newspaperManagement  = new NewspaperManagement();
        List<Newspaper> newspaperList = newspaperManagement.getNewspaperList();
        showMenu();
        while (true){
            String choose = scanner.nextLine();
            switch (choose){
                case "a":
                    showMenuBook();
                    while (true) {
                        int numberBook = scanner.nextInt();
                        switch (numberBook) {
                            case 1:
                                Book book1 = inputBook();
                                bookManagement.addBook(book1);
                                break;
                            case 2:
                                System.out.println("Enter the book ID to delete");
                                long idDelete = scanner.nextLong();
                                Book book2 = bookManagement.searchBookID(idDelete);
                                if (book2 != null) {
                                    bookManagement.removeBook(book2);
                                } else {
                                    System.out.println("No ID found!");
                                }
                                break;
                            case 3:
                                System.out.println("Enter the ID to update");
                                long idUpdate = scanner.nextLong();
                                Book book3 = bookManagement.searchBookID(idUpdate);
                                if (book3 != null) {
                                    bookManagement.updateBook(book3);
                                    System.out.println("update success");
                                } else {
                                    System.out.println("No ID found");
                                }
                                break;
                            case 4:
                                System.out.println(" Enter the ID to find :");
                                long idSearch = scanner.nextLong();
                                Book book4 = bookManagement.searchBookID(idSearch);
                                if (book4 == null) {
                                    System.out.println("No books found");
                                    break;
                                }
                                break;

                            case 5:
                                for (Book book5 : bookList) {
                                    displayBook(book5);
                                }
                                if (bookList.size() == 0) {
                                    System.out.println("No books");
                                }
                                break;
                            case 6:
                                showMenuBook();
                                break;
                            case 7:
                                showMenu();
                                break;
                            default:
                                System.out.println("Please select (1-7)");
                        }
                    }
                case "b":
                    showMenuMagazine();
                    while (true) {
                        int numberMagazine = scanner.nextInt();
                        switch (numberMagazine) {
                            case 1:
                                Magazine magazine1 = inputMagazine();
                                magazineManagement.addMagazine(magazine1);
                                break;
                            case 2:
                                System.out.println("Enter the Magazine ID to delete");
                                long idDelete = scanner.nextLong();
                                Magazine magazine2 = magazineManagement.searchMagazineID(idDelete);
                                if (magazine2 != null) {
                                    magazineManagement.removeMagazine(magazine2);
                                } else {
                                    System.out.println("No ID found!");
                                }
                                break;
                            case 3:
                                System.out.println("Enter the ID to update");
                                long idUpdate = scanner.nextLong();
                                Magazine magazine3 = magazineManagement.searchMagazineID(idUpdate);
                                if (magazine3 != null) {
                                    magazineManagement.updateMagazine(magazine3);
                                    System.out.println("update success");
                                } else {
                                    System.out.println("No ID found");
                                }
                                break;
                            case 4:
                                System.out.println(" Enter the ID to find :");
                                long idSearch = scanner.nextLong();
                                Magazine magazine4 = magazineManagement.searchMagazineID(idSearch);
                                if (magazine4 == null) {
                                    System.out.println("No Magazines found");
                                    break;
                                }
                                break;

                            case 5:
                                for (Magazine magazine5 : magazineList) {
                                    displayMagazine(magazine5);
                                }
                                if (magazineList.size() == 0) {
                                    System.out.println("No Magazines");
                                }
                                break;
                            case 6:
                                showMenuMagazine();
                                break;
                            case 7:
                                showMenu();
                                break;
                            default:
                                System.out.println("Please select (1-7)");
                        }
                    }

                case "c":
                    showMenuNewspaper();
                    while (true) {
                        int numberNewspaper = scanner.nextInt();
                        switch (numberNewspaper) {
                            case 1:
                                Newspaper newspaper = inputNewspaper();
                                newspaperManagement.aadNewspaper(newspaper);
                                break;
                            case 2:
                                System.out.println("Enter the Newspaper ID to delete");
                                long idDelete = scanner.nextLong();
                                Newspaper newspaper2 = newspaperManagement.searchNewspaperID(idDelete);
                                if (newspaper2 != null) {
                                    newspaperManagement.removeNewspaper(newspaper2);
                                } else {
                                    System.out.println("No ID found!");
                                }
                                break;
                            case 3:
                                System.out.println("Enter the ID to update");
                                long idUpdate = scanner.nextLong();
                                Newspaper newspaper3 = newspaperManagement.searchNewspaperID(idUpdate);
                                if (newspaper3 != null) {
                                    newspaperManagement.updateNewspaper(newspaper3);
                                    System.out.println("update success");
                                } else {
                                    System.out.println("No ID found");
                                }
                                break;
                            case 4:
                                System.out.println(" Enter the ID to find :");
                                long idSearch = scanner.nextLong();
                                Newspaper newspaper4 = newspaperManagement.searchNewspaperID(idSearch);
                                if (newspaper4 == null) {
                                    System.out.println("No Newspapers found");
                                    break;
                                }
                                break;

                            case 5:
                                for (Newspaper newspaper5 : newspaperList) {
                                    displayNewspaper(newspaper5);
                                }
                                if (newspaperList.size() == 0) {
                                    System.out.println("No Newspapers");
                                }
                                break;
                            case 6:
                                showMenuNewspaper();
                                break;
                            case 7:
                                showMenu();
                                break;
                            default:
                                System.out.println("Please select (1-7)");
                        }
                    }



                default:
                    System.out.println("Please select a, b, c");
            }
        }
    }
    public static void showMenu(){
        System.out.println("Please select the object to manipulate: ");
        System.out.println("a. BOOK");
        System.out.println("b. MAGAZINE");
        System.out.println("c. NEWSPAPER");
    }
    public static void showMenuBook(){
        System.out.println("----------------");
        System.out.println("Please select the function");
        System.out.println("1. add book");
        System.out.println("2. delete book");
        System.out.println("3. update book");
        System.out.println("4. search book");
        System.out.println("5. display all book");
        System.out.println("6. show menu book");
        System.out.println("7. back home");
    }
    public static void showMenuMagazine(){
        System.out.println("-----------------");
        System.out.println("Please select the function");
        System.out.println("1. add magazine");
        System.out.println("2. delete magazine");
        System.out.println("3. update magazine");
        System.out.println("4. search magazine");
        System.out.println("5. display all magazine");
        System.out.println("6. show menu magazine");
    }
    public static void showMenuNewspaper(){
        System.out.println("-----------------");
        System.out.println("Please select the function");
        System.out.println("1. add newspaper");
        System.out.println("2. delete newspaper");
        System.out.println("3. update newspaper");
        System.out.println("4. search newspaper");
        System.out.println("5. display all newspaper ");
        System.out.println("6. show menu newspaper");
    }

    public static Book inputBook(){
        Book inputBook = new Book();
        System.out.println("Please enter information for books");
        System.out.println("ID: ");
        long ID =scanner.nextLong();
        inputBook.setID(ID);
        scanner.nextLine();
        System.out.println("producer: ");
        String producer = scanner.nextLine();
        inputBook.setProducer(producer);
        System.out.println("release number: ");
        int releaseNumber = scanner.nextInt();
        inputBook.setReleaseNumber(releaseNumber);
        scanner.nextLine();
        System.out.println("author : ");
        String author=scanner.nextLine();
        inputBook.setAuthor(author);
        System.out.println("page is : ");
        int page = scanner.nextInt();
        inputBook.setPage(page);
        scanner.nextLine();
        return  inputBook;
    }
    public static void displayBook(Book book){
        System.out.println(book.toString());
    }
    public static Magazine inputMagazine(){
        Magazine inputMagazine = new Magazine();
        System.out.println("Please enter information for magazine");
        System.out.println("ID:");
        long ID =scanner.nextLong();
        inputMagazine.setID(ID);
        scanner.nextLine();
        System.out.println("producer: ");
        String producer = scanner.nextLine();
        inputMagazine.setProducer(producer);
        System.out.println("release number: ");
        int releaseNumber = scanner.nextInt();
        inputMagazine.setReleaseNumber(releaseNumber);
        scanner.nextLine();
        System.out.println("release month: ");
        String releaseMonth = scanner.nextLine();
        inputMagazine.setReleaseMonth(releaseMonth);
        System.out.println("issue number: ");
        int issueNumber = scanner.nextInt();
        inputMagazine.setIssueNumber(issueNumber);
        return inputMagazine;
    }
    public static void displayMagazine(Magazine magazine){
        System.out.println(magazine.toString());
    }


    public static Newspaper inputNewspaper() {
        Newspaper inputNewspaper = new Newspaper();
        System.out.println("Please enter information for Newspaper :");
        System.out.println("ID:");
        long ID = scanner.nextLong();
        inputNewspaper.setID(ID);
        scanner.nextLine();
        System.out.println("producer: ");
        String producer = scanner.nextLine();
        inputNewspaper.setProducer(producer);
        System.out.println("release number: ");
        int releaseNumber = scanner.nextInt();
        inputNewspaper.setReleaseNumber(releaseNumber);
        scanner.nextLine();
        System.out.println("release date:");
        String releaseDate = scanner.nextLine();
        inputNewspaper.setReleaseDate(releaseDate);
        return inputNewspaper;
    }
    public static void displayNewspaper(Newspaper newspaper){
        System.out.println(newspaper.toString());
    }

}
