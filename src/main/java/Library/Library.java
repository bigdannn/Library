package Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Library {
    public static void main(String[] args) throws Exception {

        ArrayList<Author> authors = new ArrayList<>();
        ArrayList<Book> aut = new ArrayList<>();
        ArrayList<Genre> genres = new ArrayList<>();
        String input;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to our library! What would you like to do? Add author, book, genre; delete author, book genre; show all authors, books, genres");


        int a, b, c, d, e, f, g;

        while (!(input = reader.readLine()).equals("exit")) {
            switch (input) {
                case "add author":
                    authors.add(addAuthor());
                    break;
                case "add book":
                    System.out.println("Who is the author?");
                    System.out.println(authors);
                    System.out.println("If you see the correct author, write down number of his position (Starting from 0). If nobody suits you, write -1.");
                    a = Integer.parseInt(reader.readLine());
                    if (a == -1) {
                        authors.add(addAuthor());
                    } else {
                        Author author = authors.get(a);
                        author.getBook().add(addBook());
                    }
                    System.out.println("What is the genre of the book?");
                    System.out.println(genres);
                    System.out.println("If you see the correct genre, write down number of its position (Staarting with 0), please. If nothing suits you, write -1.");
                    c = Integer.parseInt(reader.readLine());
                    if(c == -1){
                        genres.add(addGenre());
                    } else{
                        Genre genre = genres.get(c);
                        genre.getBook();
                    }
                    break;
                case "add genre":
                    genres.add(addGenre());
                    break;
                case "show all books of the following author":
                    System.out.println(authors);
                    System.out.println("Write down number of the author that you are interested in(Starting with 0), please.");
                    b = Integer.parseInt(reader.readLine());
                    Author author1 = authors.get(b);
                    System.out.println(author1.books);
                    break;
                case "show all the authors":
                    System.out.println(authors);
                    break;
                case "show all genres" :
                    System.out.println(genres);
                    break;
                case "remove author":
                    System.out.println("Write down the number of author that you want to remove(Starting with 0), please.");
                    System.out.println(authors);
                    d= Integer.parseInt(reader.readLine());
                    authors.remove(d);
                    break;
                case "remove book":
                    System.out.println("Write down the number of author who's book you want to remove(Starting with 0), please.");
                    System.out.println(authors);
                    e = Integer.parseInt(reader.readLine());
                    Author author = authors.get(e);
                    System.out.println("Now choose which book you want to remove(Starting with 0), please.");
                    System.out.println(author.books);
                    f = Integer.parseInt(reader.readLine());
                    author.books.remove(f);
                    break;
                case "remove genre":
                    System.out.println("Write down the number of genre which you want to remove(Starting with 0), please.");
                    System.out.println(genres);
                    g = Integer.parseInt(reader.readLine());
                    genres.remove(g);
                    break;
                    default:
                    System.out.println("Sorry, i don't understand what you want me to do.");
                    break;

            }
        }

    }

    public static Author addAuthor() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String lastName;
        System.out.println("What's author's first name?");
        name = reader.readLine();
        System.out.println("What's author's last name?");
        lastName = reader.readLine();
        Author a = new Author(name, lastName);
        return a;
    }

    public static Book addBook() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String bookName;
        String description;
        int year;

        System.out.println("What is the name of the book?");
        bookName = reader.readLine();
        System.out.println("How can you describe the plot?");
        description = reader.readLine();
        System.out.println("What is the year of issue?");
        year = Integer.parseInt(reader.readLine());
        Book b = new Book(bookName, description, year);
        return b;
    }

    public static Genre addGenre() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String description;

        System.out.println("What is the name of the genre you want to add?");
        name = reader.readLine();
        System.out.println("How can you describe this genre?");
        description = reader.readLine();
        Genre g = new Genre(name, description);
        return g;

    }
}
