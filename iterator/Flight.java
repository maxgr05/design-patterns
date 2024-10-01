//@author Max Granger
import java.time.LocalTime;
import java.time.Duration;

public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * @param flightNum flight number
     * @param from from airport
     * @param to to airport
     * @param startTime time of departure
     * @param endTime time of arrival
     * @param numTransfers number of transfers/stops
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    /**
     * @return from airport
     */
    public Airport getFrom() {
        return this.from;
    }

    /**
     * @return to airport
     */
    public Airport getTo() {
        return this.to;
    }

    /**
     * @param from from airport
     * @param to to airport
     * @return bool if they are equal
     */
    public boolean sameLoc(Airport from, Airport to) {
        return (from.equals(to));
    }

    /**
     * @return string representation of flight + duration of flight
     */
    public String toString() {
        String transfer = "";
        if (numTransfers == 0) {
            transfer = "Direct Flight";
        } else if (numTransfers == 1) {
            transfer = "1 Stopover";
        } else {
            transfer = numTransfers + " Transfers";
        }
        Duration duration = Duration.between(startTime, endTime);
        String dur = duration.toHoursPart() + "h " + duration.toMinutesPart() + "m";
        return this.from + " to " + this.to + " " + this.startTime + " - " + this.endTime + " (" + dur + ") " + transfer;
    }
}    
