package principal;

public class TestIgualdadCadenas {
	public static void main(String[] args) {
		String s1="one";
		StringBuilder sb1= new StringBuilder(s1);
		String s2=s1;
		String s3=sb1.toString();
		StringBuilder sb2=new StringBuilder(s2);
		
		System.out.println(s1.equals(sb1)); //false Son objetos de distinto tipo (String y StringBuilder)
		System.out.println(s1==s3);       //false  s1 es un objeto y s3 se refiere a un objeto diferente
		System.out.println(s2.equals(s3));//true 
		System.out.println(sb1==sb2);     //false son objetos diferentes aunque contengan el mismo texto
		System.out.println(sb1.equals(sb2)); //false 
		
		// == se refiere a que los dos sean el mismo objeto
		//.equals para el mismo contenido y, en StringBuilder, siempre da false salvo que sean el mismo objeto
	}

}
