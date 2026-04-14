package TP1.ejercicio5;

public class Valores {
	public int maximo;
	public int minimo;
	public int promedio;
	
	
	public Valores(int maximo, int minimo, int promedio) {
		this.maximo = maximo;
		this.minimo = minimo;
		this.promedio = promedio;
	}
	public int getMaximo() {
		return maximo;
	}
	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}
	public int getMinimo() {
		return minimo;
	}
	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}
	public int getPromedio() {
		return promedio;
	}
	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}
	@Override
	public String toString() {
		return "Valores [maximo=" + maximo + ", minimo=" + minimo + ", promedio=" + promedio + "]";
	}
	
	
}
