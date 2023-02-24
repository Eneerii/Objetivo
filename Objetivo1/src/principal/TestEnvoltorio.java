package principal;

public class TestEnvoltorio {

	public static void main(String[] args) {
		String n="100";
		Integer num=Integer.valueOf(n);// o Integer.getInteguer(n) para convertir el String en un Integer
		
		Integer k=10; //autoboxing
		//para meter ese número en una variable 
		int x=k; //unboxing
		final Integer r=5;
		//switch no funciona con Integer pero no como valores de los case. Porque esos valores deben ser constantes.
		switch (k) {
		case 1:
		//case r: da error porque se está refiriendo al Objeto Integer y no es constante.
		}
		
	}

}
