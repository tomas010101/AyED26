package TP1.ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		System.out.println("Ingrese un valor N: ");
		int n = s.nextInt();
		int [] arreglo = multiplosDeN(n);
		for (int i = 0; i < n; i ++) {
			System.out.println( arreglo[i]);
		}
		

	}
	
	public static int[] multiplosDeN(int n){
		int [] arreglo = new int [n];
		
		for (int i = 0; i < n; i++) {
			arreglo[i] = ( i + 1) * n;
		}
		
		return arreglo;
	}

}
