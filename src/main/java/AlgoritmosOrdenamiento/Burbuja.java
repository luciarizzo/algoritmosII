package AlgoritmosOrdenamiento;

public class Burbuja {

    //Tomar elementos de a pares. Si estan desordenados, se intercambian.
    //UNIDIRECCIONAL:Tomar un elemento de la primera posicion. Si hay algun elemento menor a este, se lo intercambia.
    //Una vez que en esta posicion queda el menor de los elementos se avanza con el siguiente
    public static void sortBurbujaUnidireccional(int[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //BIDIRECCIONAL: Se dejan los extremos ordenados en primer lugar
    public static void sortBurbujaBidireccional(int[] array) {
        int n = array.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            left++;
        }
    }
}
