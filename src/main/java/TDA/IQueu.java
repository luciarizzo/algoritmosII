package TDA;

public interface IQueu {
    /*
    Postcondicion: acola (coloca en el final de la cola) un valor
     */
    void add(int a);
    /*
    precondicion: la cola no esta vacia
    postcondicion: desacola (quita el primer elemento)
     */
    void remove();
    /*
    return true si la cola esta vacia, falso para cualquier otro caso
     */
    boolean isEmpty();
    /*
    return devuelve el primero
     */
    int getFirst();
}
