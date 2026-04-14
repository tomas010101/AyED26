package TP1.ejercicio1;

class Ejercico1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 15;
		System.out.println("Los numeros entre A y B son");
		entreNumerosFor(a,b);
		System.out.println("=============================");
		entreNumerosWhile (a,b);
		System.out.println("=============================");
		System.out.println("Usando 	Recursivo:");
		entreNumerosRecursivo(a,b);
	}
	
	public static void entreNumerosFor(int a, int b) {
		System.out.println("Usando For:");
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}
	
	public static void entreNumerosWhile (int a, int b) {
		System.out.println("Usando While:");
		while (a <= b) {
			System.out.println(a);
			a++;
		}
	}
	
	public static void entreNumerosRecursivo(int a, int b) {
		System.out.println(a);
		if (a < b) {
			a++;
			entreNumerosRecursivo(a,b);
		}
	}

}
