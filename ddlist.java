import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    
    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void addFront(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addEnd(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void addBtw(int data, int key) {
        if (head == null) {
            System.out.println("List is empty, data added at front.");
            addFront(data);
            return;
        }

        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Key not found, data added at the end.");
            addEnd(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Data not found.");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (temp.next == null) {
            temp.prev.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

       
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class ddlist {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Add front\n2. Add end\n3. Add between\n4. Delete\n5. Display\n6. Exit");

            int choice = sc.nextInt();
            int data, key;

            switch (choice) {
                case 1:
                    System.out.println("Enter data:");
                    data = sc.nextInt();
                    list.addFront(data);
                    break;
                case 2:
                    System.out.println("Enter data:");
                    data = sc.nextInt();
                    list.addEnd(data);
                    break;
                case 3:
                    System.out.println("Enter data:");
                    data = sc.nextInt();
                    System.out.println("Enter key:");
                    key = sc.nextInt();
                    list.addBtw(data, key);
                    break;
                case 4:
                    System.out.println("Enter data:");
                    data = sc.nextInt();
                    list.delete(data);
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
