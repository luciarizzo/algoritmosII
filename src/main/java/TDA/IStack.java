package TDA;

public interface IStack {
    /*
    Postcondicion: coloca en el tope un valor
    @param a valor a apilar
     */
    void add(int a);
    /*
    Precondicion: la pila no esta vacia
    Postcondicion: desapila (quita el tope)
     */
    void remove();
    /*
    @return true si la pila esta vacia, false en otro caso
     */
    boolean isEmpty();

    /*
    @return devuelve el tope
     */
    int getTop();

    //int copy(IStack stack);
}
