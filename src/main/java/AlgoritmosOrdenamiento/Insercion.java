package AlgoritmosOrdenamiento;

public class Insercion {
    /*
    Consideramos que a la izquierda esta ordenado, y lo colocamos en la posicion que corresponda pero dentro de ese rango.
    A la derecha, lo que nos falta por ordenar.
     */
    public static void sort(int[] array){
        for (int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[i] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
