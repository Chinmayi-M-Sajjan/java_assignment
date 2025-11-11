package com.tricon.basic.programabstract;

public abstract class LibraryItems {
    String id;
    String title;
    boolean isAvailable;

    public LibraryItems(String id, String title, boolean isAvailable){
        this.id=id;
        this.title=title;
        this.isAvailable=isAvailable;
    }

    public abstract void displayInfo();





}
