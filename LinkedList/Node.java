package LinkedList;

public class Node {
    int value;
    Node address;

    Node head;
    Node tail;

    int size=0;

    public Node(int value, Node address){
        this.value = value;
        this.address=address;

    }

    public Node(int value){
        this.value = value;
        this.address=null;
        this.size =0;

    }

    public void insertAtFirst(int data){
        Node node = new Node(data);
        node.address =head;
        head = node;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.address;
        }
    }

    public Node(){

    }


    public static void main(String[] args) {
        Node node = new Node();
        node.insertAtFirst(5);
        node.insertAtFirst(4);
        node.insertAtFirst(3);
        node.insertAtFirst(2);
        node.insertAtFirst(1);

        node.display();
    }
}
