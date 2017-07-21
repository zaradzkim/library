package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Marcel on 2017-07-20.
 */
public class Library {

    private ArrayList<Book> booksList;

    public Library(ArrayList<Book> booksList){
        this.booksList = booksList;

    }


    public void addBook() {
        boolean successful = false;
        int bookID;
        int year;
        String title = "";
        String author = "";
        boolean available = true;
        Scanner input = new Scanner(System.in);


            System.out.println("Enter ID: ");
            bookID = input.nextInt();
            input.nextLine();
            for (int i = 0; i < booksList.size(); i++) {
                if (booksList.get(i).getBookID() != bookID) {
                    successful = true;
                } else {
                    System.out.println("Book with this ID exsist!");
                }
            }





            System.out.println("Enter title: ");
            title = input.nextLine();

            System.out.println("Enter author: ");
            author = input.nextLine();

            System.out.println("Enter year: ");
            year = input.nextInt();


        Book book = new Book(title, author, bookID, year, available);
            booksList.add(book);
            System.out.println("Book created successful!");


    }

        public void rentBook() {

            Scanner input = new Scanner(System.in);
            //boolean successful = false;

            System.out.println("Enter ID of book you want to rent: ");
            int bookID = input.nextInt();

            for (int i = 0; i < booksList.size(); i++) {
                if (booksList.get(i).getBookID() == bookID) {

                        System.out.println("Enter your name: ");
                        String lenderName = input.nextLine();
                        input.nextLine();
                       Book book = new Book(booksList.get(i).getTitle(), booksList.get(i).getAuthor(),
                               lenderName, bookID, booksList.get(i).getYear(), booksList.get(i).setAvailable(booksList.get(i).isAvailable() == false));  // błąd nie wiem jak to rozwiązać


                        booksList.add(book);

                        System.out.println("The book " + booksList.get(i).getTitle() + " is rent!");
                    } else {
                        System.out.println("The Book is not available!");
                    }
                }

            }


        public void showAvailableBooks(){
            System.out.println("Available books: ");
            for(int i =0; i < booksList.size(); i++) {
                if(booksList.get(i).isAvailable())

                    System.out.println("Title: " + booksList.get(i).getTitle() + " Author: " + booksList.get(i).getAuthor() + " Book Id: " + booksList.get(i).getBookID() + " Year: " +
                            booksList.get(i).getYear());
                }

            }


        public void showRentBooks(){
            System.out.println("Rent books: ");
            for(int i = 0; i < booksList.size(); i++) {
                if(!booksList.get(i).isAvailable())

                    System.out.println("Title: " + booksList.get(i).getTitle() + " Author: " + booksList.get(i).getAuthor() + " Book Id: " + booksList.get(i).getBookID() + " Year: " +
                            booksList.get(i).getYear() + " Lender Name: " + booksList.get(i).getLenderName());
                }
            }

            public void deleteBook() {
                Scanner input = new Scanner(System.in);
                int bookID = 0;
                boolean successful = false;

                System.out.println("Enter ID to delete the book: ");
                bookID = input.nextInt();
                for (int i = 0; i < booksList.size(); i++){
                    if ( bookID == booksList.get(i).getBookID() && booksList.get(i).isAvailable())
                    {
                        System.out.println("The book" + booksList.get(i).getTitle() + " was delete sucessful");
                        booksList.remove(i);
                        successful = true;
                        break;
                    }
                    if (!successful) {
                        System.out.println("Book with this ID does not exsist or is rent!");

                    }
                }
            }
        }



