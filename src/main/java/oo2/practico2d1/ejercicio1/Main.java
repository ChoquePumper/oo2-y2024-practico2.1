package oo2.practico2d1.ejercicio1;

public class Main {
	public static void main(String[] args) {

		AprendiendoLambdas a = new AprendiendoLambdas();
		a.unMetodo((b) -> { System.out.println("abcd" + b);});	// B
		a.unMetodo(() -> System.out.println("abcd"));	// A
		a.unMetodo((variable) -> {System.out.println("abcd");});	// B
		a.unMetodo((C) (variable) -> {System.out.println("abcd"); return true;}); // C?
		a.unMetodo((Long variable) -> {
			System.out.println("abcd");
			return 10L;
		});	// D
	}
}
