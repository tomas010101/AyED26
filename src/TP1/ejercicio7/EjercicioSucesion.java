package TP1.ejercicio7;
import java.util.*;

public class EjercicioSucesion {

	public static void main(String[] args) {
		
		int numero = 6;
		
		List <Integer> lista = calcularSucesion(numero);
		
		for (Integer num : lista) {
			System.out.println(num);
		}
		
		ArrayList <Integer> arreglo = new ArrayList<>();
		
		for (int i = 0; i < 7; i++) {
			arreglo.add(i+1);
		}
		
		System.out.println("----------------");
		System.out.println("----------------");
		
		for(Integer dato : arreglo) {
			System.out.println(dato);
		}
		
		invertirArrayList(arreglo);
		
		System.out.println("----------------");
		
		for(Integer dato : arreglo) {
			System.out.println(dato);
		}
		
	}
	
	// g
	public static List<Integer> calcularSucesion (int n) {
		List <Integer> lista = new LinkedList<>();
		

		lista.add(n);
		
		if (n == 1) {
			return lista;
		}
		
		if ((n%2) == 0) {
			n = n / 2;
		}
		else {
			n = 3*n + 1;
		}

		lista.addAll(calcularSucesion(n));

		return lista;
	}
	
	// h)
	/* public static void invertirArrayList(ArrayList<Integer> lista) {
		int auxiliar;
		auxiliar = lista.get(0);
		if (lista.size() > 1) {			
			lista.remove(0);
			invertirArrayList(lista);
			lista.add(auxiliar);
		}
		
	}*/
	
	//version pro de Gemini
	public static void invertirArrayList(ArrayList<Integer> lista) {
	    // Caso base: Si la lista está vacía, no hay nada que hacer. ¡Salimos!
	    if (lista.isEmpty()) {
	        return;
	    }

	    // 1. Quitamos el primero SIEMPRE
	    int auxiliar = lista.remove(0);

	    // 2. Llamada recursiva con la lista más chica
	    invertirArrayList(lista);

	    // 3. Al volver de la recursión, lo metemos al final
	    lista.add(auxiliar);
	}
	

}
