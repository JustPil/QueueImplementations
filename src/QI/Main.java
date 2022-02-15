package QI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String choice = "";
        Scanner scn = new Scanner(System.in);
        while (!choice.equalsIgnoreCase("X")) {
            initialMenu();
            choice = scn.nextLine();
            if(choice.equals("1")) {
                queueArrayList(scn);
            } else if(choice.equals("2")) {
                dequeArray(scn);
            } else if(choice.equals("3")) {
                dequeLinkedList(scn);
            } else if(choice.equals("4")) {
                dequeCircularLinkedList(scn);
            } else if(choice.equalsIgnoreCase("X")) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        scn.close();
    }

    /**
     * queueArrayList A Test Driver for the Queue ADT implemented with an ArrayList.
     * @param s A Scanner to relay user input.
     */
    public static void queueArrayList(Scanner s) {
        ArrayListQueue<Integer> queue = new ArrayListQueue<>();
        String choice = "";
        while(!choice.equalsIgnoreCase("X")) {
            queueArrayListMenu();
            choice = s.nextLine();
            if(choice.equals("1")) {
                System.out.print("Enter an integer to add to the queue: ");
                int input = s.nextInt();
                s.nextLine();
                queue.enqueue(input);
                System.out.println("Added " + input);
            } else if(choice.equals("2")) {
                System.out.println("Removed: " + queue.dequeue());
            } else if(choice.equals("3")) {
                System.out.println("Empty queue: " + queue.isEmpty());
            } else if(choice.equals("4")) {
                System.out.println("Full queue: " + queue.isFull());
            } else if(choice.equals("5")) {
                System.out.println("Size: " + queue.size());
            } else if(choice.equals("X")) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    /**
     * dequeArray A Test Driver for the Deque ADT implemented with an Array.
     * @param s A Scanner to relay user input.
     */
    public static void dequeArray(Scanner s) {
        Deque<Integer> deque = new Deque<>();
        String choice = "";
        while(!choice.equalsIgnoreCase("X")) {
            dequeArrayMenu();
            choice = s.nextLine();
            if(choice.equals("1")) {
                System.out.print("Enter an integer to add to the front of the deque: ");
                int input = s.nextInt();
                s.nextLine();
                deque.enqueueFront(input);
                System.out.println("Added to front: " + input);
            } else if(choice.equals("2")) {
                System.out.print("Enter an integer to add to the rear of the deque: ");
                int input = s.nextInt();
                s.nextLine();
                deque.enqueueRear(input);
                System.out.println("Added to rear: " + input);
            } else if(choice.equals("3")) {
                System.out.println("Removed from front: " + deque.dequeueFront());
            } else if(choice.equals("4")) {
                System.out.println("Removed from rear: " + deque.dequeueRear());
            } else if(choice.equals("5")) {
                System.out.println("Empty deque: " + deque.isEmpty());
            } else if(choice.equals("6")) {
                System.out.println("Full deque: " + deque.isFull());
            } else if(choice.equals("7")) {
                System.out.println("Size: " + deque.size());
            } else if(choice.equalsIgnoreCase("X")) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    /**
     * dequeLinkedList A Test Driver for the Deque ADT implemented with a Linked List.
     * @param s A Scanner to relay user input.
     */
    public static void dequeLinkedList(Scanner s) {
        LinkedListDeque<Integer> deque = new LinkedListDeque<>();
        String choice = "";
        while(!choice.equalsIgnoreCase("X")) {
            dequeLinkedListMenu();
            choice = s.nextLine();
            if(choice.equals("1")) {
                System.out.print("Enter an integer to add to the front of the deque: ");
                int input = s.nextInt();
                s.nextLine();
                deque.enqueueFront(input);
                System.out.println("Added to front: " + input);
            } else if(choice.equals("2")) {
                System.out.print("Enter an integer to add to the rear of the deque: ");
                int input = s.nextInt();
                s.nextLine();
                deque.enqueueRear(input);
                System.out.println("Added to rear: " + input);
            } else if(choice.equals("3")) {
                System.out.println("Removed from front: " + deque.dequeueFront());
            } else if(choice.equals("4")) {
                System.out.println("Removed from rear: " + deque.dequeueRear());
            } else if(choice.equals("5")) {
                System.out.println("Empty deque: " + deque.isEmpty());
            } else if(choice.equals("6")) {
                System.out.println("Full deque: " + deque.isFull());
            } else if(choice.equals("7")) {
                System.out.println("Size: " + deque.size());
            } else if(choice.equals("8")) {
                System.out.println(deque.toString());
            } else if(choice.equals("9")) {
                System.out.print("Enter an amount of nodes to remove from the deque: ");
                int amount = s.nextInt();
                s.nextLine();
                deque.remove(amount);
                System.out.println("Removed " + amount + " nodes.");
            } else if(choice.equals("10")) {
                System.out.println("Swap start: " + deque.swapStart());
            } else if(choice.equals("11")) {
                System.out.println("Swap ends: " + deque.swapEnds());
            } else if(choice.equals("X")) {
                break;
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

    /**
     * dequeCircularLinkedList A Test Driver for the Deque ADT implemented with a Circularly Linked
     * List.
     * @param s A Scanner to relay user input.
     */
    public static void dequeCircularLinkedList(Scanner s) {
        CircularLinkedListQueue<Integer> deque = new CircularLinkedListQueue<>();
        String choice = "";
        while(!choice.equalsIgnoreCase("X")) {
            dequeCircularMenu();
            choice = s.nextLine();
            if(choice.equals("1")) {
                System.out.print("Enter an integer to add to the front of the deque: ");
                int input = s.nextInt();
                s.nextLine();
                deque.enqueueFront(input);
                System.out.println("Added to front: " + input);
            } else if(choice.equals("2")) {
                System.out.print("Enter an integer to add to the rear of the deque: ");
                int input = s.nextInt();
                s.nextLine();
                deque.enqueueRear(input);
                System.out.println("Added to rear: " + input);
            } else if(choice.equals("3")) {
                System.out.println("Removed from front: " + deque.dequeueFront());
            } else if(choice.equals("4")) {
                System.out.println("Removed from rear: " + deque.dequeueRear());
            } else if(choice.equals("5")) {
                System.out.println("Empty deque: " + deque.isEmpty());
            } else if(choice.equals("6")) {
                System.out.println("Full deque: " + deque.isFull());
            } else if(choice.equals("7")) {
                System.out.println("Size: " + deque.size());
            } else if(choice.equals("8")) {
                System.out.println(deque.toString());
            } else if(choice.equals("9")) {
                System.out.print("Enter an amount of nodes to remove from the deque: ");
                int amount = s.nextInt();
                s.nextLine();
                deque.remove(amount);
                System.out.println("Removed " + amount + " nodes.");
            } else if(choice.equals("10")) {
                System.out.println("Swap start: " + deque.swapStart());
            } else if(choice.equals("11")) {
                System.out.println("Swap ends: " + deque.swapEnds());
            } else if(choice.equals("X")) {
                break;
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

    /**
     * initialMenu The initial menu of choices.
     */
    public static void initialMenu() {
        System.out.print("Queue and Deque ADT Implementations\n1 - Queue (ArrayList)\n2 - " +
                "Deque (Array)\n3 - Deque (Linked List)\n4 - Deque (Circular Linked List)\nX - " +
                "Terminate\nEnter choice: ");
    }

    /**
     * queueArrayListMenu The menu of choices for the Queue implemented with an ArrayList.
     */
    public static void queueArrayListMenu() {
        System.out.print("\nMethods for Queue (ArrayList Implementation)\n1 - ENQUEUE - Adds " +
                "an element to the rear of the queue\n2 - DEQUEUE - Removes an element from the" +
                " front of the queue\n3 - IS EMPTY - Checks if the queue is empty\n4 - IS FULL " +
                "- Checks if the queue is full\n5 - SIZE - Reports the number of elements in " +
                "the queue\nX - Terminate\n\nEnter choice: ");
    }

    /**
     * dequeArrayMenu The menu of choices for the Deque implemented with an Array.
     */
    public static void dequeArrayMenu() {
        System.out.print("\nMethods for Deque (Array Implementation)\n1 - ENQUEUE FRONT - " +
                "Adds an element to the front of the deque\n2 - ENQUEUE REAR - Adds an element" +
                " to the rear of the deque\n3 - DEQUEUE FRONT - Removes an element from the " +
                "front of the deque\n4 - DEQUEUE REAR - Removes an element from the rear of the" +
                " deque\n5 - IS EMPTY - Checks if the deque is empty\n6 - IS FULL - Checks if " +
                "the deque is full\n7 - SIZE - Reports the number of elements in the deque\nX " +
                "- Terminate\n\nEnter choice: ");
    }

    /**
     * dequeLinkedListMenu The menu of choices for the Deque implemented with a Linked List.
     */
    public static void dequeLinkedListMenu() {
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
    }

    /**
     * dequeCircularMenu The menu of choices for the Deque implemented with a circular Linked List.
     */
    public static void dequeCircularMenu() {
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
    }
}
