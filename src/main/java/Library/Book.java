package Library;

import java.util.ArrayList;

public class Book {

    public String name;
    public String description;
    public int yearOfIssue;
    public String genre;


    ArrayList<Genre> genres = new ArrayList<>();

    public Book(String name, String description, int yearOfIssue){
        this.name = name;
        this.description = description;
        this.yearOfIssue = yearOfIssue;
    }

    public ArrayList<Genre> getGenre(){
        return genres;
    }
}
