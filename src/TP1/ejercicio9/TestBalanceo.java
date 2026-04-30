package TP1.ejercicio9;
import java.util.*;

public class TestBalanceo {
	
	public static void main(String[] args) {
		
		String exp = "{( ) [ ( ) ] }";

		System.out.println("La expresión está balanceada? " + validar(exp));
	}
	
	
	private static boolean validar(String expresion) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < expresion.length(); i++) {
			char car = expresion.charAt(i);
			if ((car == '(') || (car == '[') || (car == '{')) {
				stack.push(car);
			}
			else if (stack.isEmpty()) {
				return false;
			}
			else if (car != ' ') {
				char opuesto = stack.pop();
				if (opuesto == '(') {
					if (car != ')') {
						return false;
					}
				}
				else if (opuesto == '[') {
					if (car != ']') {
						return false;
					}
				}
				else {
					if (car != '}') {
						return false;
					}
				}
			}
		}
		return stack.isEmpty();
	}
	
}
