package org.generation.italy.HelloObjectWorld.model;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    public String firstname;
    public String lastname;
    public LocalDate birthDate;
    public char sex;
    public boolean female;
    public Book[] textBook = new Book[5];
    public int numBooks;

    public Student(){

    }
    public Student(String fn, String ln, LocalDate bD, boolean f){
        firstname = fn;
        lastname = ln;
        birthDate = bD;
        female = f;
    }
    public int getAge(){
        LocalDate today = LocalDate.now();
        Period agePeriod = Period.between(birthDate, today);
        int age = agePeriod.getYears();
        return age;
    }
    public void greet(){
        System.out.printf("Ciao, io sono %s %s e sono %s%n", firstname, lastname, female? "una programmatrice Java" : "uno shampista");

    }
    public String[] getFavouriteLanguages(){
        int age = getAge();
        if(age > 40){
            return new String[] {"Java", "C++"};
        } else {
            return new String[] {"Javascript", "Typescript"};
        }

    }
    public boolean addBook(Book book){
        for(int i = 0;i < textBook.length;i++){
            if(textBook[i] == null){
                textBook[i] = book;
                numBooks++;
                return true;
            }  
        }

        return false;
    }
    
    public void printBooks(){
        if(numBooks == 0){
            System.out.println("Bestia che ignorante che sei!");
        } else {
            for(int i = 0; i < textBook.length;i++){
                if(textBook[i] != null){
                    System.out.println(textBook[i].title);
                }
            }
        }
        
    }
}

