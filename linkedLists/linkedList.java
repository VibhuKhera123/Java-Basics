import java.util.*;

class linkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public void addFirstElement(int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLastElement(int d){
        Node newNode = new Node(d);
        if(head == null){
            addFirstElement(d);
        }else{
            Node currNode = head;
            while (currNode.next != null){
                currNode = currNode.next;  
            }
            currNode.next = newNode;
            currNode = newNode;
        }
    }

    public void printList(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }else{
            Node currentNode = head;
            while (currentNode.next != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.print(currentNode.data + " -> ");
            System.out.print("Null\n");
            return;
        }
    }

    public static void main(String[] args) {
        int data,opr;
        System.out.println("Ready");
        Scanner sc = new Scanner(System.in);
        linkedList list = new linkedList();
        System.out.println("Select an option: ");
        System.out.println("1. Add Element at start\n2. Add Element at end\n3. Print List\n4. exit");
        System.out.print("Enter the operation: ");
        opr = sc.nextInt();
        while(opr != 4){
        switch (opr) {
            case 1:
                System.out.print("Enter the data: ");
                data = sc.nextInt();
                list.addFirstElement(data);
                System.out.print("Select other operation operation: ");
                opr = sc.nextInt();
                break;
            case 2:
                System.out.print("Enter the data: ");
                data = sc.nextInt();
                list.addLastElement(data);
                System.out.print("Select other operation operation: ");
                opr = sc.nextInt();
                break;

            case 3:
                list.printList();
                System.out.print("Select other operation operation: ");
                opr = sc.nextInt();
                break;
        
            default:
                System.out.println("Invalid Operation");
                System.out.print("Select other operation operation: ");
                opr = sc.nextInt();
                break;
        }}
        sc.close();
   } 
}