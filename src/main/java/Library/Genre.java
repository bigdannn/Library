package Library;

import java.util.ArrayList;

public class Genre {

    public String name;
    public String description;

    ArrayList<Book> books = new ArrayList<>();

    public Genre(String name, String description){
        this.name = name;
        this.description = description;
    }

    public ArrayList<Book> getBook(){
        return books;
    }

    public String toString(){
        return name + ". " + "description";
    }
}
