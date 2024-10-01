//@author Max Granger
import java.util.ArrayList;
import java.util.Iterator;

public class FlightIterator implements Iterator {
    private ArrayList<Flight> flights;
    private int position = 0;
    private Airport from;
    private Airport to;

    /**
     * @param flights arraylist of flights
     * @param from from airport
     * @param to to airport
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.from = from;
        this.to = to;
        this.flights = new ArrayList<Flight>();
        ArrayList<Flight> allFlights = FlightLoader.getFlights();
        for (Flight f : allFlights) {
            if (f.getFrom().equals(from)) {
                if (f.getTo().equals(to)) {
                    this.flights.add(f);
                }
            }
        }
    }

    /** 
     * @return bool if has more flights
     */
    public boolean hasNext() {
        if (position >= flights.size() || flights.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * advances to next flight
     */
    public Flight next() {
        Flight flight = flights.get(position);
        position++;
        return flight;
    }
}
