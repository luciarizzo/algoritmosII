package TDA;

public class DynamicQueu implements IQueu {
    private Node first;

    public DynamicQueu(int a) {
        this.first = new Node(a, this.first);
    }

    @Override
    public void add(int a) {
        Node node = new Node(a, null);
        if (this.first == null) {
            this.first = node;
            return;
        }
        Node candidate = this.first;
        while (candidate.getNext() != null) {
            candidate = candidate.getNext();
        }
        candidate.setNext(node);
    }

    @Override
    public void remove() {
        if (this.first == null) {
            System.out.println("Error no se puede desacolar una cola vacia");
            return;
        }
        this.first = this.first.getNext();
    }

    @Override
    public boolean isEmpty() {
        return this.first == null;
    }

    @Override
    public int getFirst() {
        if (this.first == null) {
            System.out.println("Error, no se puede obtener el primero de una cola vacia");
            return -1;
        }
        return this.first.getValue();
    }

/*
    COLA - ESTRUCTURAS DESTRUCTIVAS DE TIPO FIFO
     */

    public IQueu print(IQueu queu) {
        IQueu copy = new DynamicQueu(1);
        IQueu aux = new DynamicQueu(1);
        while (!queu.isEmpty()) {
            aux.add(queu.getFirst());
            copy.add(queu.getFirst());
            copy.remove();
            queu.remove();
        }
        while (!aux.isEmpty()) {
            queu.add(aux.getFirst());
            aux.remove();
        }
        return copy;
    }
}
