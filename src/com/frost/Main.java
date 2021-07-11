package com.frost;

import com.frost.status.*;

public class Main {

    public static void main(String[] args) {
	Book book = new Book("Джанго");
        // write your code here

        Available available = new Available();
        Borrowed borrowed = new Borrowed();
        Archived archived = new Archived();
        Overdude overdude = new Overdude();

        available.moveToStatus(book, Status.BORROWED);
        System.out.println("Книга переведена в статус - " + book.getStatus());

        borrowed.moveToStatus(book, Status.ARCHIVED);
        System.out.println("Книга переведена в статус - " + book.getStatus());

        archived.moveToStatus(book, Status.OVERDUED);
        System.out.println("Книга переведена в статус - " + book.getStatus());


        
    }









}
