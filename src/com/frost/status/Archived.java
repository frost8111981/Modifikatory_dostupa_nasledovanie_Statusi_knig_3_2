package com.frost.status;

import com.frost.Book;
import com.frost.Status;

public class Archived extends BookMoover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if(book.getStatus() == Status.ARCHIVED) {
            switch (requestedStatus){
                case AVAILABLE:

                    book.setStatus(requestedStatus);
                    break;
                default:
                    System.out.println("Перевод книги из статуса 'X' в статус 'Y' невозможен");
                    break;


            }
        }
    }
}
