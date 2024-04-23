package oo2.practico2d1.ejercicio2;

public class Main {
	public static void main(String[] args) {

		// a. Utilizando un lambda dado que imprima true si el largo del String es par, false en caso contrario.
		C lambdaA = (s) -> s.length() % 2 == 0;
		// b. Utilizando un lambda dado que imprima true si el String empieza con a minúscula, false en caso
		//contrario.
		C lambdaB = (s) -> Character.isLowerCase(s.toCharArray()[0]);

		AprendiendoLambdas aprendiendoLambdas = new AprendiendoLambdas();
		aprendiendoLambdas.unMetodo(lambdaA);
		aprendiendoLambdas.unMetodo(lambdaB);
	}

}
