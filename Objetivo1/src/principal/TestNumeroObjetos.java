package principal;

public class TestNumeroObjetos {

	public static void main(String[] args) {
		String a="hello";
		String b="by";
		a=a+b;
		//¿Cuántos objetor ecisten en memoria al llegat a este punto? 3: El objeto hello, el objeto by y el objeto hello by

		/*StringBuilder a= new StringBuilder("Hello");
		String b="by";
		a.append(b);*/
		//¿Cuántos objetos existen en memotia al llegar a este punto? 2: con el append, modificamos a y siguen siendo 2. En el String normal, no se puede.
	}

}
