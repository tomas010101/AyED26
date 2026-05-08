package TP2.ejercicio1;

public class RedBinariaLlena {
	
	
	public int retardoReenvio(BinaryTree<Integer> redBinaria) {
		int hijoIzquierdo = 0, hijoDerecho = 0;
		if (redBinaria == null || redBinaria.isEmpty()) {
			return 0;
		}
		if (redBinaria.hasLeftChild()) {
			hijoIzquierdo = retardoReenvio(redBinaria.getLeftChild());
		}
		if(redBinaria.hasRightChild()) {
			hijoDerecho = retardoReenvio(redBinaria.getRightChild());
		}
		if (hijoDerecho > hijoIzquierdo) {
			return hijoDerecho + redBinaria.getData();
		}
		else {
			return hijoIzquierdo + redBinaria.getData();
		}
		
	}
	
}
