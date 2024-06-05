package AlgoritmosBusqueda;

public class Binaria {
    //Para un algoritmo de busqueda binaria, necesitamos un array ordenado de menor a mayor.
    //Parte en 2 el arreglo.
    //Este algoritmo es muy eficiente con una complejidad de tiempo de O(log n),
    // lo que lo hace mucho más rápido que una búsqueda secuencial en grandes conjuntos
    // de datos ordenados.

    public static int busquedaBinaria(int[] array, int key) {
        int left = 0; // Inicio del rango de búsqueda
        int right = array.length - 1; // Final del rango de búsqueda

        while (left <= right) { // Mientras el rango de búsqueda sea válido
            int mid = left + (right - left) / 2; // Calcular el índice del medio para evitar desbordamiento

            if (array[mid] == key) { // Si el elemento del medio es la clave, devolver el índice
                return mid;
            } else if (array[mid] < key) { // Si la clave es mayor que el elemento del medio, buscar en la mitad derecha
                left = mid + 1;
            } else { // Si la clave es menor que el elemento del medio, buscar en la mitad izquierda
                right = mid - 1;
            }
        }

        return -1; // Si no se encuentra la clave, devolver -1
    }

}
