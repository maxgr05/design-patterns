/* Written by Max Granger */
package observer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /** Default constructor 
     * @param subject is the best sellers list
     */
    public Store(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
        bestSellers = new LinkedList<Book>();
    }
    //Observer override method
    @Override
    public void update(Book book) {
        bestSellers.add(book);
        if (bestSellers.size() > 5) {
            bestSellers.remove();
        }
    }

    /**
     * @return list of best sellers
     */
    public List<Book> getBestSellers() {
        return (List<Book>) bestSellers;
    }
}
