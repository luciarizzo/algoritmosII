package AlgoritmosOrdenamiento;

public class Casilleros {

    //Para un arreglo de enteros.
    // La idea es dividir numeros del arreglo en buckets que son rangos, y luego se ordenan los rangos.

    public static void BucketSort(int[] array) {
        //Determinar el valor maximo y minimo del arreglo.
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
        //Crear los casilleros
        int[] boxes = new int[max - min + 1];

        //Contar la frecuencia de cada valor en el arreglo y asignarlo al casillero correspondiente
        for(int i=0; i < array.length; i++){
            boxes[array[i] - min]++;
        }

        //Reordenar el arreglo utilizando los valores en los casilleros
        int index = 0;
        for(int i = 0; i < boxes.length; i++){
            for(int j = 0; j < boxes[i]; j++){
                array[index] = i + min;
                index++;
            }
        }
    }
}
