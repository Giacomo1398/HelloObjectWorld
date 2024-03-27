package org.generation.italy.HelloObjectWorld.model;

public class Book {
    public String title;
    public int pages;
    public double cost;
    public String genre;
    //Se il libro ha un numero di pagine superiore a 200 e il genere è != dalla stringa "comico",
    //questo metodo ritornerà la stringa "palloso", altrimenti dovrà ritornare "divertente".
    //Chiameremo questo metodo getBookType.}

    public Book(String title, int pages, double cost, String genre){
        this.title = title;
        this.pages = pages;
        this.cost = cost;
        this.genre = genre;
    }

    public String getBookType(){
    if(pages > 200 && !"comico".equals(genre)){
        return "Palloso";
    }
    return "Divertente";
    }

    public int getTitleLength(){
        return title.length();
    }
}
