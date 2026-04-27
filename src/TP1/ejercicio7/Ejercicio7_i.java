package TP1.ejercicio7;
import java.util.*;


public class Ejercicio7_i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lista = new LinkedList<>();
		
		for (int i = 0; i < 10; i++) {
			lista.add(i);
		}
		
		for(Integer i: lista) {
			System.out.println(i);
		}
		
		System.out.println("");
		System.out.print("La suma de todo los elementos de la lista es: " + sumarLinkedList(lista));
		
	}
	
	public static int sumarLinkedList(LinkedList<Integer> lista) {
		int actual = 0;
		if (!lista.isEmpty()) {
			actual = lista.getFirst();
			lista.removeFirst();
			actual = actual + sumarLinkedList(lista);
		}
		return actual;
	}

}
