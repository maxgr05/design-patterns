/* Written by Max Granger */
package strategy;
import java.util.List;

public class BinarySearch implements SearchBehavior {
    public boolean contains(List<Person> people, Person person) {
        people = sortList(people);
        int start = 0;
        int end = people.size();
        while (start <= end) {
            end = end - start;
            int mid = (start + end)/2;
            if (people.get(mid).equals(person)) {
                return true;
            } else if (people.get(mid).compareTo(person) > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
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
