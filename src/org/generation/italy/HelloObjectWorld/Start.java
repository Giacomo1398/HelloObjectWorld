package org.generation.italy.HelloObjectWorld;

import java.time.LocalDate;
import java.util.Arrays;

import org.generation.italy.HelloObjectWorld.model.Book;
import org.generation.italy.HelloObjectWorld.model.Student;

public class Start {
    public static void main(String[] args){
        Student s2 = new Student("Ciccio", "Pasticcio", LocalDate.of(1998, 6, 20), false);
        s2.greet();
        System.out.println(s2.getAge());
        System.out.println(Arrays.toString(s2.getFavouriteLanguages()));
        Book b1 = new Book("Harry Potter", 451, 40.00, "Fantasy");
        Book b2 = new Book("Divergent", 345, 32.99, "Fantasy - Young Adult");
        s2.addBook(b1);
        s2.addBook(b2);
        s2.printBooks();
    }
}
