package com.frost.status;

import com.frost.Book;
import com.frost.Status;

public class Available extends BookMoover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if(book.getStatus() == Status.AVAILABLE) {
            switch (requestedStatus){
                case BORROWED:
                case ARCHIVED:
                    book.setStatus(requestedStatus);
                    break;
                default:
                    System.out.println("Перевод книги из статуса 'X' в статус 'Y' невозможен");
                    break;


            }
        }
    }
}
