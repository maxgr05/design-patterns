/* Written by Max Granger */
package strategy;
import java.util.*;

public class Attendees {
    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;
    
    /**
     * Creates guest list
     * @param title title of the guest list
     */
    public Attendees(String title) {
        this.title = title;
        this.people = new ArrayList<Person>();
        this.searchBehavior = new LinearSearch();
    }

    /**
     * Adds person to guest list
     * @param firstName the person's first name
     * @param lastName the person's last name
     * @param phoneNumber the person's phone number
     * @param reminder saved note about person
     * @return
     */
    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person newP = new Person(firstName, lastName, phoneNumber, reminder);
        people.add(newP);
        return newP;
    }

    /**
     * @return title of list
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param searchBehavior sets search to Linear or Binary
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }
    /**
     * @return the list
     */
    public List<Person> getList(){
        return sortList(people);
    }

    /** Bubble sorts the list of guests
     * @return sorted list
     */
    public List<Person> sortList(List<Person> people) {
        boolean flag = true;
        while (flag == true) {
            flag = false;
            for (int i = 0; (i < people.size() - 1); i++) {
                if (people.get(i).compareTo(people.get(i + 1)) > 0) {
                    Person temp = new Person(people.get(i));
                    people.set(i, people.get(i + 1));
                    people.set(i + 1, temp);
                    flag = true;
                }
            }
        }
       return people;
    }
}
