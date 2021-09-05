package QI;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String choice = "";
        Scanner scn = new Scanner(System.in);
        while (!choice.equalsIgnoreCase("X"))
        {
            System.out.print("Queue and Deque ADT Implementations\n1 - Queue (ArrayList)\n2 - " +
                    "Deque (Array)\n3 - Deque (Linked List)\n4 - Deque (Circular Linked List)\nX - " +
                    "Terminate\nEnter choice: ");
            choice = scn.nextLine();
            if (choice.equals("1"))
            {
                queueArrayList(scn);
            }
            else if (choice.equals("2"))
            {
                dequeArray(scn);
            }
            else if (choice.equals("3"))
            {
                dequeLinkedList(scn);
            }
            else if (choice.equals("4"))
            {
                dequeCircularLinkedList(scn);
            }
            else if (choice.equalsIgnoreCase("X"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }
        scn.close();
    }

    /**
     * queueArrayList A Test Driver for the Queue ADT implemented with an ArrayList.
     * @param s A Scanner to relay user input.
     */
    public static void queueArrayList(Scanner s)
    {
        ArrayListQueue<Integer> alq = new ArrayListQueue<>();
        String choice = "";
        while(!choice.equalsIgnoreCase("X"))
        {
            System.out.print("\nMethods for Queue (ArrayList Implementation)\n1 - ENQUEUE - Adds " +
                    "an element to the rear of the queue\n2 - DEQUEUE - Removes an element from the" +
                    " front of the queue\n3 - IS EMPTY - Checks if the queue is empty\n4 - IS FULL " +
                    "- Checks if the queue is full\n5 - SIZE - Reports the number of elements in " +
                    "the queue\nX - Terminate\n\nEnter choice: ");
            choice = s.nextLine();
            if(choice.equals("1"))
            {
                System.out.print("Enter an integer to add to the queue: ");
                int input = s.nextInt();
                s.nextLine();
                alq.enqueue(input);
                System.out.println("Added " + input);
            }
            else if(choice.equals("2"))
            {
                System.out.println("Removed: " + alq.dequeue());
            }
            else if(choice.equals("3"))
            {
                System.out.println("Empty queue: " + alq.isEmpty());
            }
            else if(choice.equals("4"))
            {
                System.out.println("Full queue: " + alq.isFull());
            }
            else if(choice.equals("5"))
            {
                System.out.println("Size: " + alq.size());
            }
            else if(choice.equals("X"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }
    }

    /**
     * dequeArray A Test Driver for the Deque ADT implemented with an Array.
     * @param s A Scanner to relay user input.
     */
    public static void dequeArray(Scanner s)
    {
        Deque<Integer> d = new Deque<>();
        String choice = "";
        while(!choice.equalsIgnoreCase("X"))
        {
            System.out.print("\nMethods for Deque (Array Implementation)\n1 - ENQUEUE FRONT - " +
                    "Adds an element to the front of the deque\n2 - ENQUEUE REAR - Adds an element" +
                    " to the rear of the deque\n3 - DEQUEUE FRONT - Removes an element from the " +
                    "front of the deque\n4 - DEQUEUE REAR - Removes an element from the rear of the" +
                    " deque\n5 - IS EMPTY - Checks if the deque is empty\n6 - IS FULL - Checks if " +
                    "the deque is full\n7 - SIZE - Reports the number of elements in the deque\nX " +
                    "- Terminate\n\nEnter choice: ");
            choice = s.nextLine();
            if(choice.equals("1"))
            {
                System.out.print("Enter an integer to add to the front of the deque: ");
                int input = s.nextInt();
                s.nextLine();
                d.enqueueFront(input);
                System.out.println("Added to front: " + input);
            }
            else if(choice.equals("2"))
            {
                System.out.print("Enter an integer to add to the rear of the deque: ");
                int input = s.nextInt();
                s.nextLine();
                d.enqueueRear(input);
                System.out.println("Added to rear: " + input);
            }
            else if(choice.equals("3"))
            {
                System.out.println("Removed from front: " + d.dequeueFront());
            }
            else if(choice.equals("4"))
            {
                System.out.println("Removed from rear: " + d.dequeueRear());
            }
            else if(choice.equals("5"))
            {
                System.out.println("Empty deque: " + d.isEmpty());
            }
            else if(choice.equals("6"))
            {
                System.out.println("Full deque: " + d.isFull());
            }
            else if(choice.equals("7"))
            {
                System.out.println("Size: " + d.size());
            }
            else if(choice.equalsIgnoreCase("X"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }
    }

    /**
     * dequeLinkedList A Test Driver for the Deque ADT implemented with a Linked List.
     * @param s A Scanner to relay user input.
     */
    public static void dequeLinkedList(Scanner s)
    {
        LinkedListDeque<Integer> lld = new LinkedListDeque<>();
        String choice = "";
        while(!choice.equalsIgnoreCase("X"))
        {
            System.out.print("\nMethods for Deque (Linked List Implementation)\n1 - ENQUEUE FRONT - " +
                    "Adds an element to the front of the deque\n2 - ENQUEUE REAR - Adds an element" +
                    " to the rear of the deque\n3 - DEQUEUE FRONT - Removes an element from the " +
                    "front of the deque\n4 - DEQUEUE REAR - Removes an element from the rear of the" +
                    " deque\n5 - IS EMPTY - Checks if the deque is empty\n6 - IS FULL - Checks if " +
                    "the deque is full\n7 - SIZE - Reports the number of elements in the deque\n8 " +
                    "- TO STRING - Outputs information about the deque\n9 - REMOVE - Remove a set " +
                    "amount of nodes from the deque\n10 - SWAP START - Swap the first two nodes in " +
                    "the deque\n11 - SWAP ENDS - Swap the last two nodes in the deque\nX - Terminate" +
                    "\n\nEnter choice: ");
            choice = s.nextLine();
            if(choice.equals("1"))
            {
                System.out.print("Enter an integer to add to the front of the deque: ");
                int input = s.nextInt();
                s.nextLine();
                lld.enqueueFront(input);
                System.out.println("Added to front: " + input);
            }
            else if(choice.equals("2"))
            {
                System.out.print("Enter an integer to add to the rear of the deque: ");
                int input = s.nextInt();
                s.nextLine();
                lld.enqueueRear(input);
                System.out.println("Added to rear: " + input);
            }
            else if(choice.equals("3"))
            {
                System.out.println("Removed from front: " + lld.dequeueFront());
            }
            else if(choice.equals("4"))
            {
                System.out.println("Removed from rear: " + lld.dequeueRear());
            }
            else if(choice.equals("5"))
            {
                System.out.println("Empty deque: " + lld.isEmpty());
            }
            else if(choice.equals("6"))
            {
                System.out.println("Full deque: " + lld.isFull());
            }
            else if(choice.equals("7"))
            {
                System.out.println("Size: " + lld.size());
            }
            else if(choice.equals("8"))
            {
                System.out.println(lld.toString());
            }
            else if(choice.equals("9"))
            {
                System.out.print("Enter an amount of nodes to remove from the deque: ");
                int amount = s.nextInt();
                s.nextLine();
                lld.remove(amount);
                System.out.println("Removed " + amount + " nodes.");
            }
            else if(choice.equals("10"))
            {
                System.out.println("Swap start: " + lld.swapStart());
            }
            else if(choice.equals("11"))
            {
                System.out.println("Swap ends: " + lld.swapEnds());
            }
            else if(choice.equals("X"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid input.");
            }
        }
    }

    /**
     * dequeCircularLinkedList A Test Driver for the Deque ADT implemented with a Circularly Linked
     * List.
     * @param s A Scanner to relay user input.
     */
    public static void dequeCircularLinkedList(Scanner s)
    {
        CircularLinkedListQueue<Integer> cllq = new CircularLinkedListQueue<>();
        String choice = "";
        while(!choice.equalsIgnoreCase("X"))
        {
            System.out.print("\nMethods for Deque (Circular Linked List Implementation)\n1 - " +
                            "ENQUEUE FRONT - Adds an element to the front of the deque\n2 - ENQUEUE" +
                            " REAR - Adds an element to the rear of the deque\n3 - DEQUEUE FRONT - " +
                            "Removes an element from the front of the deque\n4 - DEQUEUE REAR - " +
                            "Removes an element from the rear of the deque\n5 - IS EMPTY - Checks" +
                            " if the deque is empty\n6 - IS FULL - Checks if the deque is full\n7 -" +
                            " SIZE - Reports the number of elements in the deque\n8 - TO STRING -" +
                            " Outputs information about the deque\n9 - REMOVE - Remove a set amount" +
                            " of nodes from the deque\n10 - SWAP START - Swap the first two nodes in" +
                            " the deque\n11 - SWAP ENDS - Swap the last two nodes in the deque\nX -" +
                            " Terminate\n\nEnter choice: ");
            choice = s.nextLine();
            if(choice.equals("1"))
            {
                System.out.print("Enter an integer to add to the front of the deque: ");
                int input = s.nextInt();
                s.nextLine();
                cllq.enqueueFront(input);
                System.out.println("Added to front: " + input);
            }
            else if(choice.equals("2"))
            {
                System.out.print("Enter an integer to add to the rear of the deque: ");
                int input = s.nextInt();
                s.nextLine();
                cllq.enqueueRear(input);
                System.out.println("Added to rear: " + input);
            }
            else if(choice.equals("3"))
            {
                System.out.println("Removed from front: " + cllq.dequeueFront());
            }
            else if(choice.equals("4"))
            {
                System.out.println("Removed from rear: " + cllq.dequeueRear());
            }
            else if(choice.equals("5"))
            {
                System.out.println("Empty deque: " + cllq.isEmpty());
            }
            else if(choice.equals("6"))
            {
                System.out.println("Full deque: " + cllq.isFull());
            }
            else if(choice.equals("7"))
            {
                System.out.println("Size: " + cllq.size());
            }
            else if(choice.equals("8"))
            {
                System.out.println(cllq.toString());
            }
            else if(choice.equals("9"))
            {
                System.out.print("Enter an amount of nodes to remove from the deque: ");
                int amount = s.nextInt();
                s.nextLine();
                cllq.remove(amount);
                System.out.println("Removed " + amount + " nodes.");
            }
            else if(choice.equals("10"))
            {
                System.out.println("Swap start: " + cllq.swapStart());
            }
            else if(choice.equals("11"))
            {
                System.out.println("Swap ends: " + cllq.swapEnds());
            }
            else if(choice.equals("X"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid input.");
            }
        }
    }
}
