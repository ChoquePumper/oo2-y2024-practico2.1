package oo2.practico2d1.ejercicio1;

interface A {
	void metodo();
}

interface B {
	void metodo(String b);
}

interface C {
	boolean metodo(String c);
}

interface D<T, R> {
	R metodo(T c);
}

public class AprendiendoLambdas {
	public void unMetodo(A a) {
		a.metodo();
	}

	public void unMetodo(B b) {
		b.metodo("unString");
	}

	public void unMetodo(C c) {
		System.out.println(c.metodo("otroString") ? "true" : "false");
	}

	public void unMetodo(D<Long, Long> d) {
		d.metodo(10L);
	}
}