import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Read the integer N
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        // TODO: Create a LinkedList of Integers
        LinkedList<Integer> list = new LinkedList<>();
        
        // TODO: Read N integers and add them to the LinkedList
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        }
        
        // TODO: Create a ListIterator for the LinkedList
        ListIterator<Integer> it = list.listIterator();
        
        // TODO: Traverse the list in the forward direction and print the elements
        System.out.print("Forward: ");
        while (it.hasNext()) {
            System.out.print(it.next() + (it.hasNext() ? " " : ""));
        }
        System.out.println();
        
        // TODO: Traverse the list in the backward direction and print the elements
        // The iterator is now at the end of the list, so we can use hasPrevious()
        System.out.print("Backward: ");
        while (it.hasPrevious()) {
            System.out.print(it.previous() + (it.hasPrevious() ? " " : ""));
        }
        System.out.println();
        
        scanner.close();
    }
}
