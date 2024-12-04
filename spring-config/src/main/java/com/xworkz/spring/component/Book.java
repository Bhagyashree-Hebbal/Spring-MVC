package com.xworkz.spring.component;

public class Book implements Start{

    public Book(){
        System.out.println("Book const");
    }


    @Override
    public void display() {
        System.out.println("Book is a display of book");
    }
}
