package com.tricon.basic.programabstract;

import java.util.*;

public class Library {
        Map<String, LibraryItems> items = new HashMap<>();
    public void addItems(LibraryItems item){
        items.put(item.id,item);
    }
    public LibraryItems findItemById(String id){
        return items.get(id);
    }
    public void displayAllAvailableItems(){
        for(LibraryItems item: items.values()){
            if(item.isAvailable){
                item.displayInfo();
            }
        }
    }
}