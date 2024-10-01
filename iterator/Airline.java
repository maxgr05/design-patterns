//@author Max Granger
import java.util.ArrayList;
import java.util.Iterator;

public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    /**
     * @param title string name of airline
     */
    public Airline(String title) {
        this.title = title;
        this.flights  = FlightLoader.getFlights();
    }

    /**
     * @return strint title of airline
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @param fromCode string from airport code
     * @param toCode string to airport code
     * @return new FlightIterator(flights, from, to)
     */
    public Iterator<Flight> createIterator(String fromCode, String toCode) {
        Airport from;
        Airport to;
        if (Airport.isValid(fromCode) && Airport.isValid(toCode)) {
            from = Airport.valueOf(fromCode.toUpperCase());
            to = Airport.valueOf(toCode.toUpperCase());
        } else {
            System.out.println("Please enter a valid airport code.");
            return null;
        }
        return new FlightIterator(flights, from, to);
    }
}
