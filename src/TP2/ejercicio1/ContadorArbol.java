package TP2.ejercicio1;
import java.util.*;
public class ContadorArbol {
	
	private BinaryTree<Integer> arbol = new BinaryTree<Integer>();
	
	public LinkedList numerosPares (BinaryTree<Integer> arbol) {
		LinkedList<Integer> listaPar = new LinkedList<Integer>();

		if (arbol == null || arbol.isEmpty()) {
			return listaPar;
		}
		if (arbol.getData() % 2 == 0) {
			listaPar.add(arbol.getData());
		}
		
		if (arbol.hasLeftChild()) {
			listaPar.addAll(numerosPares(arbol.getLeftChild()));
		}
		if (arbol.hasRightChild()) {
			listaPar.addAll(numerosPares(arbol.getRightChild()));
		}
		return listaPar;
		
	}
	
	
	//----------------------------------------------------------------------------------------
	
	
	//a
	public LinkedList numerosParesInOrden(BinaryTree<Integer> arbol) {
		LinkedList<Integer> listaPar = new LinkedList<Integer>();

		if (arbol == null || arbol.isEmpty()) {
			return listaPar;
		}
		
		if (arbol.hasLeftChild()) {
			listaPar.addAll(numerosParesInOrden(arbol.getLeftChild()));
		}
		
		if (arbol.getData() % 2 == 0) {
			listaPar.add(arbol.getData());
		}
		
		
		if (arbol.hasRightChild()) {
			listaPar.addAll(numerosParesInOrden(arbol.getRightChild()));
		}
		return listaPar;
	}
	

	//b
	public LinkedList numerosParesPosOrden(BinaryTree<Integer> arbol) {
		LinkedList<Integer> listaPar = new LinkedList<Integer>();

		if (arbol == null || arbol.isEmpty()) {
			return listaPar;
		}
		
		if (arbol.hasLeftChild()) {
			listaPar.addAll(numerosParesPosOrden(arbol.getLeftChild()));
		}
		
		if (arbol.hasRightChild()) {
			listaPar.addAll(numerosParesPosOrden(arbol.getRightChild()));
		}
		
		if (arbol.getData() % 2 == 0) {
			listaPar.add(arbol.getData());
		}
		
		return listaPar;
	}

}
