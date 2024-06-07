package AlgoritmosMatrices;

public class Traza {
    //La traza de una matriz es igual a la suma de los elementos de su diagonal principal
    public int obtenerTraza(int[][] matriz){
        int traza = 0;
        int n = matriz.length; //para no acceder al valor en cada iteracion
        for(int i = 0; i < n; i++){
            traza += matriz[i][i];
        }
        return traza;

    }
}
