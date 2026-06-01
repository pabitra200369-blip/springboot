package com.book;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookDao dao = new BookDao();

        while (true) {

            System.out.println("\n===== BOOK MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book Price");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    Book book =
                            new Book(title, author, category, price);

                    dao.addBook(book);

                    break;

                case 2:

                    dao.viewBooks();

                    break;

                case 3:

                    System.out.print("Enter Book ID: ");
                    int searchId = sc.nextInt();

                    dao.searchBook(searchId);

                    break;

                case 4:

                    System.out.print("Enter Book ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Price: ");
                    double newPrice = sc.nextDouble();

                    dao.updateBookPrice(updateId, newPrice);

                    break;

                case 5:

                    System.out.print("Enter Book ID: ");
                    int deleteId = sc.nextInt();

                    dao.deleteBook(deleteId);

                    break;

                case 6:

                    System.out.println("Thank You!");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
