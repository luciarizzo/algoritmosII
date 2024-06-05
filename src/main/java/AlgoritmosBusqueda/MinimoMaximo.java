package AlgoritmosBusqueda;

public class MinimoMaximo {
    // >
    // <

    //-----------Encontrar el minimo o maximo.
    // La clave es tomar candidato, el que tiene mas chances hasta un momento dado de ser el menor o el mayor segun busquemos.
    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
