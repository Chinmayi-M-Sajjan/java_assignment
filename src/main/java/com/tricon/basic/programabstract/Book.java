package com.tricon.basic.programabstract;

public class Book extends LibraryItems implements Borrowable {
    String author;

    public Book(String id, String title, boolean isAvailable,String author) {
        super(id, title, isAvailable);
        this.author=author;
    }

    @Override
    public void borrowItem(String userId){
        try {
            if (isAvailable) {
                System.out.println("the book is available");
                isAvailable=false;
            } else {
                throw new BookNotAvailableException("book is not available");
            }
        }
        catch(BookNotAvailableException e){
            System.out.println(e.getMessage());

        }
    }

    @Override
    public void returnItem(String userId) {
        try {
            if (userId == "1") {
                System.out.println("the user is available ");

            }
            else{
                throw new InvalidReturnException("user is not available");
            }
        }

        catch(InvalidReturnException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void displayInfo() {
        System.out.println("book id"+id+"\ntitle"+title+"\nauthor"+author+"\navailable"+isAvailable);
    }
}
