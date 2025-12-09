import java.util.LinkedList;
import java.util.Iterator;

public class SLLTester {
    public static void main(String[] args) {
        // Create three SuperLinkedList objects with at least 5 elements each
        SuperLinkedList list1 = new SuperLinkedList();
        SuperLinkedList list2 = new SuperLinkedList();
        SuperLinkedList list3 = new SuperLinkedList();
        
        // add list1 with vowels and consonants
        list1.add("a");
        list1.add("e");
        list1.add("b");
        list1.add("i");
        list1.add("c");
        
        // add list2 with consonants and repeated letters
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("b");
        list2.add("f");
        
        // add list3 with mixed case letters and duplicates
        list3.add("A");
        list3.add("a");
        list3.add("B");
        list3.add("a");
        list3.add("C");
        
        // Output initial lists
        System.out.println(" INITIAL LISTS \n");
        
        System.out.println("List 1:");
        printListWithIterator(list1);
        System.out.println("\nList 2:");
        printListWithIterator(list2);
        System.out.println("\nList 3:");
        printListWithIterator(list3);
        
        System.out.println("\n= TESTING removeVowels() \n");
        
        // Test removeVowels on list1
        System.out.println("List 1 before removeVowels():");
        printListWithIterator(list1);
        boolean vowelsRemoved = list1.removeVowels();
        System.out.println("\nremoveVowels() returned: " + vowelsRemoved);
        System.out.println("List 1 after removeVowels():");
        printListWithIterator(list1);
        
        // Test removeVowels on list2 (no vowels, should return false)
        System.out.println("\n--- Testing removeVowels() on list with no vowels ---");
        System.out.println("List 2 before removeVowels():");
        printListWithIterator(list2);
        vowelsRemoved = list2.removeVowels();
        System.out.println("\nremoveVowels() returned: " + vowelsRemoved);
        System.out.println("List 2 after removeVowels():");
        printListWithIterator(list2);
        
        System.out.println("\n TESTING removeConsonants() \n");
        
        // Test removeConsonants on list3
        System.out.println("List 3 before removeConsonants():");
        printListWithIterator(list3);
        boolean consonantsRemoved = list3.removeConsonants();
        System.out.println("\nremoveConsonants() returned: " + consonantsRemoved);
        System.out.println("List 3 after removeConsonants():");
        printListWithIterator(list3);
        
        System.out.println("\n TESTING removeDuplicates() \n");
        
        // Create a fresh list for testing removeDuplicates
        SuperLinkedList listWithDuplicates = new SuperLinkedList();
        listWithDuplicates.add("a");
        listWithDuplicates.add("b");
        listWithDuplicates.add("a");
        listWithDuplicates.add("c");
        listWithDuplicates.add("b");
        
        System.out.println("List before removeDuplicates():");
        printListWithIterator(listWithDuplicates);
        LinkedList<String> noDuplicates = listWithDuplicates.removeDuplicates();
        System.out.println("\nremoveDuplicates() returned list:");
        printListWithIterator(noDuplicates);
        System.out.println("\nOriginal list after removeDuplicates():");
        printListWithIterator(listWithDuplicates);
        
        System.out.println("\n TESTING concatenateStrings() \n");
        
        // Create a fresh list for testing concatenateStrings
        SuperLinkedList listToConcatenate = new SuperLinkedList();
        listToConcatenate.add("h");
        listToConcatenate.add("e");
        listToConcatenate.add("l");
        listToConcatenate.add("l");
        listToConcatenate.add("o");
        
        System.out.println("List before concatenateStrings():");
        printListWithIterator(listToConcatenate);
        LinkedList<String> concatenated = listToConcatenate.concatenateStrings();
        System.out.println("\nconcatenateStrings() returned:");
        printListWithIterator(concatenated);
        System.out.println("\nOriginal list after concatenateStrings():");
        printListWithIterator(listToConcatenate);
        
        System.out.println("\n TESTING mix() \n");
        
        // Create two fresh lists for testing mix
        SuperLinkedList listA = new SuperLinkedList();
        listA.add("a");
        listA.add("b");
        listA.add("c");
        
        SuperLinkedList listB = new SuperLinkedList();
        listB.add("x");
        listB.add("y");
        listB.add("z");
        
        System.out.println("List A:");
        printListWithIterator(listA);
        System.out.println("\nList B:");
        printListWithIterator(listB);
        
        LinkedList<String> mixed = listA.mix(listB);
        System.out.println("\nmix() returned:");
        printListWithIterator(mixed);
        
        System.out.println("\n TESTING toString() \n");
        
        // Create a fresh list for testing toString
        SuperLinkedList listForToString = new SuperLinkedList();
        listForToString.add("p");
        listForToString.add("q");
        listForToString.add("r");
        listForToString.add("s");
        listForToString.add("t");
        
        System.out.println("List contents using toString():");
        System.out.println(listForToString.toString());
        System.out.println("(Note: toString() prints on a single line with spaces)");
        
        System.out.println("\n TESTING EDGE CASES \n");
        
        // Test with empty list
        SuperLinkedList emptyList = new SuperLinkedList();
        System.out.println("Empty list - removeVowels() returned: " + emptyList.removeVowels());
        System.out.println("Empty list - removeConsonants() returned: " + emptyList.removeConsonants());
        
        // Test with single element (vowel)
        SuperLinkedList singleVowel = new SuperLinkedList();
        singleVowel.add("a");
        System.out.println("\nSingle vowel list before removeVowels():");
        printListWithIterator(singleVowel);
        System.out.println("removeVowels() returned: " + singleVowel.removeVowels());
        System.out.println("Single vowel list after removeVowels():");
        printListWithIterator(singleVowel);
        
        // Test with single element (consonant)
        SuperLinkedList singleConsonant = new SuperLinkedList();
        singleConsonant.add("b");
        System.out.println("\nSingle consonant list before removeConsonants():");
        printListWithIterator(singleConsonant);
        System.out.println("removeConsonants() returned: " + singleConsonant.removeConsonants());
        System.out.println("Single consonant list after removeConsonants():");
        printListWithIterator(singleConsonant);
    }
    
    /**
     Helper method to print a LinkedList using an Iterator.
      Prints one element per line.
     */
    private static void printListWithIterator(LinkedList<String> list) {
        Iterator<String> iter = list.iterator();
        if (!iter.hasNext()) {
            System.out.println("(empty list)");
            return;
        }
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}