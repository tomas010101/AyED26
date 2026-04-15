package TP1.ejercicio7;
import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese Numeros para cargar en ArrayList (ingres -1 para finalizar): ");
		
		Scanner s = new Scanner(System.in);
		
		// a)
		List <Integer> lista = new ArrayList();
		// b)
		List <Integer> listaLinked = new LinkedList();
		
		
		
		int numero = 0;
		
		numero = s.nextInt();
		
		while (numero != -1) {
			lista.add(numero); // Adding an element to array List
			listaLinked.add(numero); // Adding an element to Linked List
			numero = s.nextInt();
		}
		
		System.out.println(" ");
		
		for (Integer num : lista) {
			System.out.println(num);
		}
		System.out.println(" ");
		System.out.println(" ========== ");
		System.out.println(" ");
		for (Integer num : listaLinked) {
			System.out.println(num);
		}
		
		operacionesConListas();
		
	}
	
	// d
	public static void operacionesConListas () {
		
		List <Estudiante> listA = new LinkedList<>(); // repo
		
		listA.add(new Estudiante("Pepe"));
		listA.add(new Estudiante("Rodirgo"));
		listA.add(new Estudiante("Bigote"));
		
		List<Estudiante> listB = new LinkedList<>(listA);
		
		// imprimir listas
		System.out.println("Original: " + listA);
	    System.out.println("Copia: " + listB);
	    
	 // Modificar un estudiante
	    listA.get(1).setNombre("Rodolfo");
	    
	    // Volver a imprimir
	    System.out.println("Después de modificar:");
	    System.out.println("Original: " + listA);
	    System.out.println("Copia: " + listB);
	    
	    
		
	}
	
}
	
