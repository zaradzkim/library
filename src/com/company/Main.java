package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> booksList = new ArrayList<Book>();

        Library library = new Library(booksList);

        Scanner input = new Scanner(System.in);

        boolean on = true;

        for (; ; ) {

            System.out.println("Menu: ");
            System.out.println("1. Add a book");
            System.out.println("2. Rent a book");
            System.out.println("3. Show books");
            System.out.println("4. Delete book");
            System.out.println("5. Exit program");

            switch (input.nextInt()) {

                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.showAvailableBooks();
                    library.rentBook();
                    break;
                case 3:
                    library.showAvailableBooks();
                    library.showRentBooks();
                    break;
                case 4:
                    library.showAvailableBooks();
                    library.deleteBook();
                case 5:
                    System.exit(1);
                    break;
            }

        }
    }

}

