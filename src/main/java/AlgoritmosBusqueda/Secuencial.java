package AlgoritmosBusqueda;

public class Secuencial {
    //---SECUENCIAL
    /*
    La busqueda secuencial va elemento por elemento comparando hasta encontrar el que se necesita
     */
    public static int SequentialSearch(int[] array, int x){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if(array[i] == x){
                return i;
            }
        }
        return -1;
    }
}
