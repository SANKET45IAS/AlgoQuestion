import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
    }
}

public class SingleLinkList {

    public static Node create() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How Many Student Details You Want to Enter: ");
        int numElements = sc.nextInt();

        if (numElements <= 0) {
            System.out.println("List is empty.");
            return null;
        }

        Node start =null;
        Node current = null;

        for (int i = 0; i < numElements; i++) {
            System.out.println("Enter Details Of Student " + (i + 1));
            System.out.print("Enter Registration Number: ");
            int r = sc.nextInt();
            System.out.print("Enter Mark: ");
            float m = sc.nextFloat();

            Node newNode = new Node(r, m);

            if (start == null) {
                start = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                
            }
        }
        return start;
    }

    public static void display(Node start) {
        if (start == null) {
            System.out.println("It is an Empty List...");
            return;
        }

        Node current = start;
        int c = 1;
        System.out.println("Sl_no.\tRegistration Number\tMark Obtained");
        while (current != null) {
            System.out.println(c + ". \t\t" + current.regd_no + "\t\t\t" + current.mark);
            current = current.next;
            c++;
        }
    }
    

    public static void main(String[] args) {
        System.out.println("Welcome Assignment 4 Of ITER [CODER-SANKET]");
        System.out.println("First, create a list of registration numbers and marks of students");
        Node start = create();

        if (start != null) {
            System.out.println("-------Menu-------");
            System.out.println("1: Display the list");
            System.out.print("Enter your choice: ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Details of the students...");
                    display(start);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
