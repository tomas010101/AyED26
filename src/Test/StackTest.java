package Test;
import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		String exp = "(())";
		// suponemos que la expresión sólo contiene paréntesis
		System.out.println("La expresión está balanceada? " + validar(exp));

	}
	
	private static boolean validar(String expresion) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expresion.length(); i++) {
			char car = expresion.charAt(i);
			if (car == '(')
				stack.push(car);
			else if (stack.isEmpty())
				return false;
			else
				stack.pop();
			}
		return stack.isEmpty();
	}
	

}
