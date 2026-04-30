package TP1.ejercicio8;

public class CircularQueue <T> extends Queue <T> {
	
	 protected CircularQueue() {
	        super();
	    }
	
	public T shift() {
		T elemento = dequeue();
		enqueue(elemento);
		return elemento;
		
	}
}
