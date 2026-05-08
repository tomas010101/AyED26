package TP2.ejercicio6;

public class Transformacion {

    private BinaryTree<Integer> arbol;

    public Transformacion(BinaryTree<Integer> arbol) {
        this.arbol = arbol;
    }

    public BinaryTree<Integer> suma() {
        transformar(this.arbol);
        return this.arbol;
    }

    private int transformar(BinaryTree<Integer> nodo) {
        if (nodo == null || nodo.isEmpty()) {
            return 0;
        }

        int sumaIzq = 0;
        int sumaDer = 0;

        if (nodo.hasLeftChild()) {
            sumaIzq = transformar(nodo.getLeftChild());
        }

        if (nodo.hasRightChild()) {
            sumaDer = transformar(nodo.getRightChild());
        }

        int valorOriginal = nodo.getData();

        // Reemplazo el valor del nodo
        nodo.setData(sumaIzq + sumaDer);

        // Devuelvo la suma total del subárbol original
        return valorOriginal + sumaIzq + sumaDer;
    }
}
