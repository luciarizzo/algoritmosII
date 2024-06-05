package org.example;

import AlgoritmosBusqueda.MinimoMaximo;
import AlgoritmosBusqueda.Secuencial;
import AlgoritmosOrdenamiento.Burbuja;
import AlgoritmosOrdenamiento.Insercion;

import java.util.Arrays;

import static AlgoritmosOrdenamiento.Insercion.sort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        ARRAYS - BUSQUEDA
         */
        int[] array = {1,2,67,24,9};
        /* MINIMO Y MAXIMO
        int minimo = MinimoMaximo.findMin(array);
        int maximo = MinimoMaximo.findMax(array);
        System.out.printf("Maximo %d y minimo %d", minimo, maximo);*/
        /*
        SECUENCIAL
         */
        /*
        int secuencial = Secuencial.SequentialSearch(array, 9);
        System.out.printf("Encontre tu numerito en la posicion %d", secuencial);
        */
        /*
        SORT INSERCION
         */
        /*System.out.println("Arreglo sin ordenar " + Arrays.toString(array));
        sort(array);
        System.out.println("Arreglo ordenado " + Arrays.toString(array));
        */
        /*
        BUBBLE SORT UNIDIRECCIONAL Y BIDIRECCIONAL
         */
        /*
        //Burbuja.sortBurbujaBidireccional(array);

        //Burbuja.sortBurbujaUnidireccional(array);
        System.out.println("Arreglo ordenado: " + Arrays.toString(array));
         */

    }
}