package TDA;

public interface ILinkedList {
    //Identificar el conjunto minimo de operaciones que nos permitan generar al resto.
    // Caracteristicas lista: orden, admitir elementos repetidos, tener una longitud, etc.

    /*
    Agrega un elemento en la ultima posicion
    @param value contiene el valor a guardar en al ultima posicion
     */
    void add(int value);

    /*
    Postcondicion: Inserta un elemento solo si el indice es valido
    @param index valido si esta en el rango [0, length], con length la longitud de la lista.
    @param value contiene el valor a guardar en la posicion indicada
     */
    void insert(int index, int value);
    /*
    Postcondicion: elimina el elemento si existe, de lo contrario no hace nada.
    @param index positivo o cero, menor que la longitud de la lista
     */
    void remove(int index);
    /*
     @param index valido si esa en el rango [0, length), con length la longitud de la lista.
     @return valor que se encuentra en la posicion indicada
     */
    int get(int index);
    /*
    @return longitud de la lista.
     */
    int size();
    /*
    @return true solo cuando la lista esta vacia, false en otro caso.
     */
    boolean isEmpty();
}
