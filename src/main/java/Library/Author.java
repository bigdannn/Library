package Library;

import java.util.ArrayList;

public class Author {

    String firstName;
    String lastName;


    ArrayList<Book> books = new ArrayList<>();

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ArrayList<Book> getBook(){
        return books;
    }


    public String toString(){
        return  "Author is " + firstName + " " +  lastName;
    }
}
