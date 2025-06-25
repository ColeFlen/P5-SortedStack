
import java.util.Scanner;
import java.util.Collections;
import java.util.Stack;

/**
 * The SortedStack class maintains a stack of integers in ascending order.
 * It provides methods to add integers while keeping the stack sorted,
 * and to print the current state of the stack.
 * 
 *
 * @author Cole Flenniken
 * @version 1.0
 * @since 6/12/25 (Week 5 of CSC6301)
 */
public class SortedStack {

    /**
     * Main method of the class. Takes user entered integers and stores in
     * sorted order.
     * 
     * @param args default parameter for main - not used
     * @since 6/12/25 (Week 5 of CSC6301)
     */
    public static void main(String[] args) {
        SortedStack elements = new SortedStack();
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                """
                        After each input integer please use a space or click enter.
                        Input will be continued to be read until a non-integer
                        is read (excluding mentioned spacing characters).
                        """);

        while (scanner.hasNextInt()) {
            Integer currentInput = scanner.nextInt();
            System.out.println("Now adding: " + currentInput);
            elements.add(currentInput);
            elements.print();

        }

        System.out.println("No more integers expected. Ending execution.");
        scanner.close();

    }

    /**
     * A stack that stores the sorted integer elements of the Sortedstack.
     * In this case the sort is in ascending order with the start being
     * at the bottom of the stack
     * 
     * @since 6/12/25 (Week 5 of CSC6301)
     */
    private Stack<Integer> data;

    /**
     * Constructs an empty SortedStack.
     * 
     * @since 6/12/25 (Week 5 of CSC6301)
     */
    public SortedStack() {
        data = new Stack<>();
    }

    /**
     * Adds the specified integer to the stack and maintains the stack in sorted
     * order.
     *
     * @param number the integer to be added to the stack
     * @since 6/12/25 (Week 5 of CSC6301)
     */
    public void add(Integer number) {
        data.add(number);
        Collections.sort(data);
    }

    /**
     * Prints the current state of the data stack to the standard output.
     * The output includes the label "State:" followed by the contents of the data.
     * 
     * @since 6/12/25 (Week 5 of CSC6301)
     */
    public void print() {
        System.out.println("State: bottom -> " + data + " <- top");
    }

}