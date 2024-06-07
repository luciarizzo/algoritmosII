package AlgoritmosOrdenamiento;

public class Cuentas {
    public static void countingSort(int[] array){
        // Encontrar el valor maximo y minimo del arreglo
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }

        //Crear el arreglo de cuentas
        int[] countArray = new int[max - min + 1];

        //Contar la frecuencia de cada valor en el arreglo
        for(int i = 0; i < array.length; i++){
            countArray[array[i] - min]++;
        }

        //Actualizar el arreglo original con los valores ordenados
        int j = 0;
        for(int i = min; i <= max; i++){
            while (countArray[i - min] > 0){
                array[j++] = i;
                countArray[i-min]--;
            }
        }
    }
}