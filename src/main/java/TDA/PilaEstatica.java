package TDA;

public class PilaEstatica implements IStack{
    //Estatica: estructura de tamanio fijo.
    private final int[] array;
    private int count;

    public PilaEstatica(){
        this.array = new int[100000];
        this.count = 0;
    }

    @Override
    public void add(int a) {
        this.array[this.count] = a;
        this.count = 0;
    }

    @Override
    public void remove() {
        if(count == 0){
            System.out.println("Error, no se puede desapilar una pila vacia");
            return;
        }
        this.count--;
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public int getTop() {
        if(count == 0){
            System.out.println("Error , no se puede obtener el tope de una pila vacia");
            return -1;
        }
        return this.array[this.count - 1];
    }

    /*@Override
    public int copy(IStack stack) {
        IStack copy = new PilaDinamica();
        IStack aux = new PilaDinamica();
        while (!stack.isEmpty()){
            aux.add(stack.getTop());
            stack.remove();
        }
        while (!aux.isEmpty()){
            stack.add(aux.getTop());
            copy.add(aux.getTop());
            aux.remove();
        }
        return copy.getTop();
    }*/
}
