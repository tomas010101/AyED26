package TP2.ejercicio6;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree <T> {
	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;
	
	
	public BinaryTree (T data){
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public BinaryTree (){
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData (T data) {
		this.data = data;
	}
	
	public BinaryTree<T> getLeftChild() {
		if (!this.hasLeftChild()) {
			throw new RuntimeException();
		}
		return this.leftChild;
	}
	
	public BinaryTree<T> getRightChild() {
		if (!this.hasRightChild()) {
			throw new RuntimeException();
		}
		return this.rightChild;
	}
	
	public void addLeftChild( BinaryTree <T> hijoIzquierdo ) {
		this.leftChild = hijoIzquierdo;
	}
	
	public void addRightChild( BinaryTree <T> hijoDerecho ) {
		this.rightChild = hijoDerecho;
	}
	
	public void removeLeftChild() {
		this.leftChild = null;
	}
	
	public void removeRightChild() {
		this.rightChild = null;
	}
	
	public boolean isEmpty () {
		return this.data == null;
	}
	
	public boolean isLeaf () {
		return !this.hasLeftChild() && !this.hasRightChild();
	}
	
	public boolean hasLeftChild () {
		return this.leftChild != null;
	}
	
	public boolean hasRightChild () {
		return this.rightChild != null;
	}
	
	public String toString() {
		return String.valueOf(this.data);
	}
	
	
	public int contarHojas() {
		if (this.isLeaf()) {
			return 1;
		}
		
		int hojas = 0;
		
		if (this.hasLeftChild()) {
			hojas += this.getLeftChild().contarHojas();
		}
		
		if (this.hasRightChild()) {
			hojas += this.getRightChild().contarHojas();
		}
		
		return hojas;
		
	}
	
	public BinaryTree<T> espejo() {
		BinaryTree<T> nuevo = new BinaryTree<>(this.getData());

		if (this.hasLeftChild()) {
			nuevo.addRightChild(this.getLeftChild().espejo());
		}
		
		if (this.hasRightChild()) {
			nuevo.addLeftChild(this.getRightChild().espejo());
		}
		
		return nuevo;
	}
	
	public void entreNiveles(int nivel1, int nivel2) { 
		
		if (this.isEmpty()) return;

		Queue<BinaryTree<T>> cola = new LinkedList<>();
		cola.add(this);

		int nivelActual = 0;

		while (!cola.isEmpty()) {
			int cantidadNodos = cola.size();

			for (int i = 0; i < cantidadNodos; i++) {
				BinaryTree<T> nodo = cola.poll();

				if (nivelActual >= nivel1 && nivelActual <= nivel2) {
					System.out.print(nodo.getData() + " ");
				}

				if (nodo.hasLeftChild()) {
					cola.add(nodo.getLeftChild());
				}
				if (nodo.hasRightChild()) {
					cola.add(nodo.getRightChild());
				}
			}

			nivelActual++;

			if (nivelActual > nivel2) break;
		}
	}
}
