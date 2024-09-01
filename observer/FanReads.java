/* Written by Max Granger */
package observer;
import java.util.HashMap;
import java.util.ArrayList;

public class FanReads implements Observer{
    private Subject subject;
    private HashMap<Genre, ArrayList<Book>> recommendations;

    /** Default constructor
     * @param subject is the hash map
     * @param firstName user's name
     * @param lastName user's name
     */
    public FanReads(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        subject.registerObserver(this);
        recommendations = new HashMap<>();
        recommendations.put(Genre.FICTION, new ArrayList<Book>());
        recommendations.put(Genre.SCIENCE_FICTION, new ArrayList<Book>());
        recommendations.put(Genre.MYSTERY, new ArrayList<Book>());
        recommendations.put(Genre.THRILLER, new ArrayList<Book>());
        recommendations.put(Genre.NON_FICTION, new ArrayList<Book>());
        recommendations.put(Genre.HISTORICAL_FICTION, new ArrayList<Book>());
        recommendations.put(Genre.ROMANCE, new ArrayList<Book>());
    }
    //Observer override method
    @Override
    public void update(Book book) {
        //check genre, then add book to correct list
        Genre g = book.getGenre();
        for (Genre g2 : recommendations.keySet()) {
            if (g == g2) {
                ArrayList<Book> temp = recommendations.get(g2);
                temp.add(book);
                if (temp.size() > 4) {
                    temp.remove(0);
                }
                recommendations.put(g, temp);
            }
        }
    }

    /**
     * @param genre genre of recommendations wanted
     * @return oist of books of that genre
     */
    public ArrayList<Book> getRecommendations(Genre genre) {
        return recommendations.get(genre);
    }

}
