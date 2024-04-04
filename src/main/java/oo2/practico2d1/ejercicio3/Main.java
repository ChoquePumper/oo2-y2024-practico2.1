package oo2.practico2d1.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Persona[] personas = {
				// Auto generado:
				new Persona("Alice", "Johnson"),
				new Persona("Michael", "Smith"),
				new Persona("Emily", "Brown"),
				new Persona("Daniel", "Martinez"),
				new Persona("Sophia", "Lee"),
				new Persona("Benjamin", "Taylor"),
				new Persona("Olivia", "Garcia"),
				new Persona("William", "Anderson"),
				new Persona("Ava", "Wilson"),
				new Persona("Ethan", "Thompson"),
				new Persona("Mia", "Hernandez"),
				new Persona("Alexander", "Davis"),
				new Persona("Charlotte", "Rodriguez"),
				new Persona("James", "Martinez"),
				new Persona("Harper", "Lopez"),
				new Persona("Jacob", "Perez"),
				new Persona("Amelia", "Miller"),
				new Persona("Logan", "Moore"),
				new Persona("Evelyn", "Sanchez"),
				new Persona("Noah", "King"),
		};

		Consumer<Persona> mostrarPersona = (persona) -> System.out.println("* "+ persona);

		System.out.println("Nombres que empiezan con E:");
		Predicate<Persona> nombreEmpiezaConE = (persona) -> persona.nombre().startsWith("E");
		filtrarPersonas(Arrays.asList(personas), nombreEmpiezaConE).forEach(mostrarPersona);
		//nombresQueEmpiezanConE(Arrays.asList(personas)).forEach(mostrarPersona);
		System.out.println();

		System.out.println("Nombres cuya cantidad de letras es par:");
		Predicate<Persona> longitudDelNombreEsPar = (persona) -> persona.nombre().length() % 2 == 0;
		filtrarPersonas(Arrays.asList(personas), longitudDelNombreEsPar).forEach(mostrarPersona);
		//nombresCuyaCantidadDeLetrasEsPar(Arrays.asList(personas)).forEach(mostrarPersona);
		System.out.println();

		System.out.println("Nombres que cumplen ambos criterios anteriores:");
		Predicate<Persona> ambosCriterios = (persona) -> nombreEmpiezaConE.test(persona) && longitudDelNombreEsPar.test(persona);
		filtrarPersonas(Arrays.asList(personas), ambosCriterios).forEach(mostrarPersona);
		System.out.println();
	}
	//filtra la lista de personas devolviendo otra lista con
	//solo aquellas cuyo nombre comienza con E
//	public static List<Persona> nombresQueEmpiezanConE(List<Persona> p) {
//		List<Persona> resultado = new ArrayList<>();
//		for (Persona persona : p) {
//			if (persona.nombre().startsWith("E")) {
//				resultado.add(persona);
//			}
//		}
//		return resultado;
//	}
//	public static List<Persona> nombresCuyaCantidadDeLetrasEsPar(List<Persona> p) {
//		List<Persona> resultado = new ArrayList<>();
//		for (Persona persona : p) {
//			if (persona.nombre().length() % 2 == 0) {
//				resultado.add(persona);
//			}
//		}
//		return resultado;
//	}

	public static List<Persona> filtrarPersonas(List<Persona> p, Predicate<Persona> filtro) {
		List<Persona> resultado = new ArrayList<>();
		for (Persona persona : p) {
			if (filtro.test(persona)) {
				resultado.add(persona);
			}
		}
		return resultado;
	}
}
