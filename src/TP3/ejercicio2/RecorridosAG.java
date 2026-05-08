package TP3.ejercicio2;
import java.util.*;


public class RecorridosAG {
	
	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree<Integer> a, Integer n){
		
		List<Integer> lista = new LinkedList<>();
		
		if ((a != null) && (!a.isEmpty())) {
			if (a.isLeaf()) {
				if ((a.getData() % 2 != 0) && a.getData() > n) {
					lista.add(a.getData());
				}
			}
			
			List<GeneralTree<Integer>> children = a.getChildren();
			
			for (GeneralTree<Integer> child: children) {
				lista.addAll(numerosImparesMayoresQuePreOrden(child, n));
			}
		}
		
		return lista;
	}
	
	
	
	
}
