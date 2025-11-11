package com.tricon.basic.programabstract;

public class LibraryDemo {
    public static void main(String[] args) {
        Library library=new Library();
        Book b1=new Book("book1","java",true,"james");
        Book b2=new Book("book2","python",true,"james");
        Book b3=new Book("book3","c++",true,"james");
        library.addItems(b1);
        library.addItems(b2);
        library.addItems(b3);
        library.displayAllAvailableItems();

        try {
            b1.borrowItem("user1");
            b1.borrowItem("user2");
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        try {
            b1.returnItem("user2");
        } catch (InvalidReturnException e) {
            System.out.println(e.getMessage());
        }

        try {
            b1.returnItem("user1");
        } catch (InvalidReturnException e) {
            System.out.println(e.getMessage());
        }
    }
}
