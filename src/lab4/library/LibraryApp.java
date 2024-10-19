package lab4.library;
//Simplified verion of Library Management System

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class LibraryApp {

 private ArrayList<String> availableBooks = new ArrayList<>();
 private HashMap<String, ArrayList<String>> memberBorrowedBooks = new HashMap<>();

 // Adds a book to the library catalog
 public void addBook(String bookName) {
     availableBooks.add(bookName);
     System.out.println(bookName + " has been added to the catalog.");
 }

 // Adds a new member to the library (without a separate class)
 public void addMember(String memberName) {
     if (!memberBorrowedBooks.containsKey(memberName)) {
         memberBorrowedBooks.put(memberName, new ArrayList<>());
         System.out.println("Member " + memberName + " has been added.");
     } else {
         System.out.println("Member " + memberName + " already exists.");
     }
 }

 // Borrow a book from the library
 public void borrowBook(String bookName, String memberName) {
     if (!memberBorrowedBooks.containsKey(memberName)) {
         System.out.println("Member " + memberName + " not found.");
         return;
     }

     if (availableBooks.contains(bookName)) {
         availableBooks.remove(bookName);
         memberBorrowedBooks.get(memberName).add(bookName);
         System.out.println(memberName + " has successfully borrowed " + bookName);
     } else {
         System.out.println(bookName + " is either already borrowed or not available.");
     }
 }

 // Return a book to the library
 public void returnBook(String bookName, String memberName) {
     if (!memberBorrowedBooks.containsKey(memberName)) {
         System.out.println("Member " + memberName + " not found.");
         return;
     }

     if (memberBorrowedBooks.get(memberName).contains(bookName)) {
         memberBorrowedBooks.get(memberName).remove(bookName);
         availableBooks.add(bookName);
         System.out.println(memberName + " has successfully returned " + bookName);
     } else {
         System.out.println(memberName + " didn't borrow " + bookName);
     }
 }

 // Show the available books in the library
 public void showAvailableBooks() {
     System.out.println("Available Books:");
     for (String book : availableBooks) {
         System.out.println(book);
     }
 }

 public static void main(String[] args) {
	 LibraryApp library = new LibraryApp();
     Scanner scanner = new Scanner(System.in);

     // Adding some books to the catalog
     library.addBook("Dune");
     library.addBook("1984");
     library.addBook("Moby Dick");

     // Adding members
     library.addMember("Alice");
     library.addMember("Bob");

     // Prompt to choose a member
     System.out.println("\nEnter the member name:");
     String memberName = scanner.nextLine();

     // Show available books
     library.showAvailableBooks();

     // Borrow a book
     System.out.println("\nEnter the book you want to borrow:");
     String bookToBorrow = scanner.nextLine();
     library.borrowBook(bookToBorrow, memberName);

     // Show available books after borrowing
     library.showAvailableBooks();

     // Return a book
     System.out.println("\nEnter the book you want to return:");
     String bookToReturn = scanner.nextLine();
     library.returnBook(bookToReturn, memberName);

     // Show available books after returning
     library.showAvailableBooks();

     scanner.close();
 }
}

