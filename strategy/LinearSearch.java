/* Written by Max Granger */
package strategy;
import java.util.List;

public class LinearSearch implements SearchBehavior {
    /** Linear search algorithm
     * @param people lsit of guests
     * @param person target being searched for
     * @return true or false
     */
    public boolean contains(List<Person> people, Person person) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).equals(person)) {
                return true;
            }
        }
        return false;
    }
}
