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
        Iterator<String> iter = this.iterator();
        while(iter.hasNext()) {
            String element = iter.next();
            if(removedDupe.contains(element)) {
                iter.remove();
            } else {
                removedDupe.add(element);
            }
        }
        return removedDupe;
    }

    public LinkedList<String> concatenateStrings() {
        Iterator <String> iter = this.iterator();
        StringBuilder concatenated = new StringBuilder();
        while (iter.hasNext()) {
            Object element = iter.next();
            concatenated.append((String) element);
        }
        LinkedList<String> result = new LinkedList<>();
        result.add(concatenated.toString());
        return result;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {
            Iterator <String> iter1 = this.iterator();
        Iterator <String> iter2 = list2.iterator();
        LinkedList<String> finalResult = new LinkedList<>();
        while (iter1.hasNext() && iter2.hasNext()) {
            finalResult.add(iter1.next());
            finalResult.add(iter2.next());
        }
        return finalResult;
    }

    public String toString() {
        String result = "";
        Iterator <String> iter = this.iterator();
        while (iter.hasNext()) {
            Object element = iter.next();
            result += (String) element + " ";
        }

        return result;
    }
} // end SuperLinkedList