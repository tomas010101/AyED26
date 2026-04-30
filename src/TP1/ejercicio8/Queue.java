package TP1.ejercicio8;
import java.util.*;

public class Queue <T> {
	
	protected LinkedList <T> cola = new LinkedList<>();
	
	Queue (){
		
	}
	public void enqueue(T dato){
		cola.addLast(dato);
	}
	
	public T dequeue() {
	    return cola.removeFirst(); // ya elimina y retorna
	}
	
	public T head() {
		return cola.getFirst();
	}
	
	public boolean isEmpty() {
		return cola.isEmpty();
	}
	
	public int size(){
		return cola.size();
	}
	
	public String toString() {
		return cola.toString();
	}

}
