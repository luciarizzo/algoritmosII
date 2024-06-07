package AlgoritmosMatrices;

public class Recorrido {
    public static void recorrer(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j] + "");
            }
        }
    }
}
