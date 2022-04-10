package Library;

import java.util.ArrayList;

public class Genre {

    public String name;
    public String description;



    public Genre(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String toString(){
        return name + ". " + "description";
    }
}
