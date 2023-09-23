package Exercise1;

public class mainPersona {
//	Inicializar un objeto  a null y tratar
//	de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
//	con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
	public static void main(String[] args) {
		
		persona persona = null;
		try {
			System.out.println(persona.esMayorDeEdad());
		}catch (Exception e) {
			System.out.println("Lo evitamos!");
			System.out.println(e.getMessage());
		}
//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Exercise1.persona.esMayorDeEdad()" because "persona" is null
//		at Exercise1.mainPersona.main(mainPersona.java:10)
	}

}
