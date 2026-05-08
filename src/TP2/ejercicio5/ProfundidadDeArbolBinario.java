package TP2.ejercicio5;
import java.util.*;

import TP2.ejercicio1.BinaryTree;

public class ProfundidadDeArbolBinario {
	
	private BinaryTree<Integer> arbol;

    public ProfundidadDeArbolBinario(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }

    public int sumaElementosProfundidad(int p) {
        return sumaRecursiva(this.arbol, p, 0);
    }

    private int sumaRecursiva(BinaryTree<Integer> nodo, int p, int nivelActual) {
        if (nodo == null || nodo.isEmpty()) {
            return 0;
        }

        // Si estoy en el nivel buscado, sumo el valor
        if (nivelActual == p) {
            return nodo.getData();
        }

        int suma = 0;

        if (nodo.hasLeftChild()) {
            suma += sumaRecursiva(nodo.getLeftChild(), p, nivelActual + 1);
        }

        if (nodo.hasRightChild()) {
            suma += sumaRecursiva(nodo.getRightChild(), p, nivelActual + 1);
        }

        return suma;
    }
}
