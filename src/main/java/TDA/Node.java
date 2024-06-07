package TDA;

public class Node {
    //Es una clase mutable porque tiene setters, y ademas se tiene a si misma como atributo (atributo autorreferencial)
    private int value;
    private Node next;

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}
