package com.frost.status;

import com.frost.Book;
import com.frost.Status;

public class Borrowed extends BookMoover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if(book.getStatus() == Status.BORROWED) {
            switch (requestedStatus){
                case AVAILABLE:
                case ARCHIVED:
                case OVERDUED:
                    book.setStatus(requestedStatus);
                    break;
                default:
                    System.out.println("Перевод книги из статуса 'X' в статус 'Y' невозможен");
                    break;


            }
        }
    }
}
