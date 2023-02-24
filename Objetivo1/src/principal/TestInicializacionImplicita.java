package principal;

public class TestInicializacionImplicita {
	int a; //0
	static float b;//0
	static Object d;//null //los atributos siempre se inicializan y los locales no, por eso están inicializadas todas menos la del método
	Object e;//null
	public void m() {
		float c; //esta es la única que no está inicializada.
	}
	
}
