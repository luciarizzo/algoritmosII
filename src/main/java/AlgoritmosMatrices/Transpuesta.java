package AlgoritmosMatrices;

public class Transpuesta {

    // i seria fila, j columna
    public static int[][] transpose(int[][] matriz){
        int rows = matriz.length;
        int columns = matriz[0].length;
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                transpose[j][i] = matriz[i][j];
            }
        }
        return transpose;
    }
}
