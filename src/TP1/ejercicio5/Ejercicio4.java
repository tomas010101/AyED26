package TP1.ejercicio5;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arreglo = {3,6,2,8,1};
		
		Valores valo = MaxMinPro (arreglo);
		
		System.out.println(valo.toString());
		
	}
	
	public static double[] calcular(int[] v) {
	    int max = v[0];
	    int min = v[0];
	    int suma = 0;

	    for (int i = 0; i < v.length; i++) {
	        if (v[i] > max) max = v[i];
	        if (v[i] < min) min = v[i];
	        suma += v[i];
	    }

	    double promedio = (double) suma / v.length;

	    return new double[]{max, min, promedio};
	}
	
	public static Valores MaxMinPro (int [] ar) {
		int max = 0, prom = 0, min = 999;
		
		for (int i = 0; i < 5; i++) {
			prom = prom + ar[i];
			if (min > ar[i]) {
				min = ar[i];
			}
			if (max < ar[i]) {
				max = ar[i];
			}
		}
		
		prom = prom / 5;
		
		Valores valores = new Valores (max, min,prom);
		
		return valores;
	}
	

}
