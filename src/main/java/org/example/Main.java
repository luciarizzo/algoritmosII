package org.example;

import AlgoritmosBusqueda.MinimoMaximo;
import AlgoritmosBusqueda.Secuencial;
import AlgoritmosOrdenamiento.Burbuja;
import AlgoritmosOrdenamiento.Casilleros;
import AlgoritmosOrdenamiento.Cuentas;
import AlgoritmosOrdenamiento.Insercion;
import TDA.DynamicQueu;
import TDA.IQueu;
import TDA.IStack;
import TDA.PilaDinamica;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

import static AlgoritmosOrdenamiento.Insercion.sort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        ARRAYS - BUSQUEDA
         */
        int[] array = {1,2,67,24,9, 89, 34, 12, 18, -1, -6};
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

        /*
        ---- ORDENAMIENTO CASILLEROS
        Casilleros.BucketSort(array);
        System.out.println("Arreglo ordenado x bucket sort: " + Arrays.toString(array));
        */
        /*
        ----- CUENTAS
        Cuentas.countingSort(array);
        System.out.println("Arreglo ordenado x countingSort: " + Arrays.toString(array));
        */
        /*
        ------OPERACIONES PILAS: ESTRUCTURA DESTRUCTIVA.
         */
       /* PilaDinamica stack = new PilaDinamica();
        stack.add(1);
        stack.add(23);
        stack.add(94);

        while(!stack.isEmpty()){
            System.out.println(stack.getTop());
            stack.remove(); // sin esto es un loop infinito imprimiendo 94 porque obvio es el tope y la condicion nunca corta.
        }
        */

        //ESTRATEGIA PARA RESOLVER ESTO: TRABAJAR CON COPIAS. PILAS SON ESTRUCTURA DE TIPO LIFO

        DynamicQueu queu = new DynamicQueu(8);
        queu.add(1);
        queu.add(23);
        queu.add(94);
        System.out.println(queu.print(queu));

    }

}