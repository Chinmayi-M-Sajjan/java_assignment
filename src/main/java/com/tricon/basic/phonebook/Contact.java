package com.tricon.basic.phonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Contact {
    private String name;
    private long phno;
    private ContactType type;
    public enum ContactType {
        HOME, OFFICE, OTHER
    }

    public long getPhnum() {
        return phno;
    }

    public ContactType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phno=" + phno +
                ", type=" + type +
                '}';
    }

    private static final List<Contact> contacts = new ArrayList<Contact>() ;
    private static final Scanner sc = new Scanner(System.in);

    public Contact(String name, long phno, ContactType type){
        this.name=name;
        this.phno=phno;
        this.type=type;
    }
    public static void addContacts() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter phone number: ");
        long phno = Long.parseLong(sc.nextLine());


        System.out.print("Enter Type (HOME/OFFICE/OTHER): ");
        ContactType type = ContactType.valueOf(sc.nextLine().trim().toUpperCase());

        contacts.add(new Contact(name, phno, type));

        System.out.println("Contact added successfully!");
    }

    public static void searchContact() {
        System.out.println("Enter the name you want to search: ");
        String search = sc.nextLine();
        boolean found=false;

        for(Contact c: contacts) {
            if (search.equalsIgnoreCase(c.getName())) {
                System.out.println("Found: " + c);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("No contact found with name "+search);
        }
    }

    public static void deleteContact() {
        System.out.println("Enter the name you want to delete: ");
        String delete = sc.nextLine();
        boolean removed = false;
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (delete.equalsIgnoreCase(c.getName())) {
                it.remove();
                System.out.println("Removed successfully!");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("No contact found with name " + delete);
        }
    }

    public static void displayContacts() {
        System.out.println("------ ALL CONTACTS ------");
        if (contacts.isEmpty()) {
            System.out.println("No contacts available!");
            return;
        }
        contacts.forEach(System.out::println);
    }
}
