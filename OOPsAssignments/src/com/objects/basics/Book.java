package com.objects.basics;

public class Book {
    String author;
    String title;
    int price;
    String category;

    public Book(String author, String title, int price, String category) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.category = category;
    }

    void getDetails() {
        System.out.println("Details of the book are: " + "Price of the book is: " + price
                + "Title of the book is: " + title
                + "Author of the book is: " + author
                + "Booke belongs to category of :" + category);
    }
    void checkBookType(){
        if(price >= 500){
            System.out.println("Book is premium");
        } else{
            System.out.println("Book is Standard");
        }
    }
}
