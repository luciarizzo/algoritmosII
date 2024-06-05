package AlgoritmosOrdenamiento;

public class Casilleros {

    //Para un arreglo de enteros.
    // La idea es dividir numeros del arreglo en buckets que son rangos, y luego se ordenan los rangos.

    public static void BucketSort(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int[] boxes = new int[max - min + 1];

    }
}
