import java.util.LinkedList;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
    public boolean removeVowels() {
        boolean removed = false;
        Iterator <String> iter = this.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            if("aeiouAEIOU".contains(element)) {
                iter.remove();
                removed = true;
            }
        }
        return removed;
    }

    public boolean removeConsonants() {
       boolean removed = false;
        Iterator <String> iter = this.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            if(!"aeiouAEIOU".contains(element)) {
                iter.remove();
                removed = true;
            }
        }
        return removed;
    }
    

    public LinkedList<String> removeDuplicates() {
        LinkedList<String> removedDupe = new LinkedList<>();
        while(iterator().hasNext()) {
            String element = iterator().next();
            if(removedDupe.contains(element)) {
                iterator().remove();
            } else {
                removedDupe.add(element);
            }
        }
        

    }

    public LinkedList<String> concatenateStrings() {

        return null;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {

        return null;
    }

    public String toString() {

        return "";
    }
} // end SuperLinkedList