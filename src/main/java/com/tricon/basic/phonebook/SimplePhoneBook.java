package com.tricon.basic.phonebook;

import java.util.Scanner;

public class SimplePhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===== PHONE BOOK MENU =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            sc.nextLine();


            switch (choice) {
                case 1 -> Contact.addContacts();
                case 2 -> Contact.searchContact();
                case 3 -> Contact.deleteContact();
                case 4 -> Contact.displayContacts();
                case 5 -> {
                    System.out.println("Exiting Phone Book... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
