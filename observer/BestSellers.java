/* Written by Max Granger */

package observer;
import java.util.ArrayList;

public class BestSellers implements Subject{
    ArrayList<Observer> observers;
    ArrayList<Book> bestSellers;

    /**
     * Default contstructor
     */
    public BestSellers() {
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }
    //Subject methods
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    /** creates new book with information given, adds to list.
     * @param title
     * @param genre
     * @param authorFirstName
     * @param authorLastName
     * @param description
     */
    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        Book b = new Book(title, genre, authorFirstName, authorLastName, description);
        bestSellers.add(b);
        if (bestSellers.size() > 4) { //checks size
            bestSellers.remove(0);
        }
        notifyObservers(b);
    }
}
