package com.objects.basics;

public class BookMain {

    public static void main(String args[]){
        Book book = new Book("R.K.Narayana","The Guide",200,"English");
        book.getDetails();
        book.checkBookType();

        Book book1 = new Book("R.K.Narayana","Swami and friends",600,"English");
        book1.getDetails();
        book1.checkBookType();
    }
}
