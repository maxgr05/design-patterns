/* Written by Max Granger */

package observer;

public class Book {
    private String title;
    private Genre genre;
    private String authorFirstName;
    private String authorLastName;
    private String description;

    /**
     * @param title title of book
     * @param genre genre of book
     * @param authorFirstName author's first name
     * @param authorLastName author's last name
     * @param description description of book
     */
    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return genre
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * @return author's first name
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * @return auhtor's last name
     */
    public String getAuthorLastName() {
        return authorLastName;
    }

    /**
     * @return description 
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return book data in string format
     */
    public String toString() {
        return "***** " + title + " *****\n" + genre.label + " by: " + authorFirstName + " " + authorLastName + "\n" + description;
    }
}
