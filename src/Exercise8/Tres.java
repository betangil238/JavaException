package Exercise8;

public class Tres {
	private static int metodo( ) {
		int valor=0;
		try{
			valor = valor + 1; //1
			valor = valor + Integer.parseInt ("W"); //EXCEPTION
			valor = valor + 1;//NO EJECUTA
			System.out.println("Valor final del try: " + valor);//NO EJECUTA
		} catch(NumberFormatException e) {
			valor = valor + Integer.parseInt ("W"); //EXCEPTION SIN CAPTURAR
			System.out.println("Valor final del catch: " + valor);//NO EJECUTA
		} 
			valor = valor + 1;//2
			System.out.println("Valor final del finally:" + valor);//2
		
			valor = valor + 1;//NO EJECUTA
			System.out.println("Valor antes del return: " + valor) ;//NO EJECUTA
			return valor;//NO EJECUTA
	}
		public static void main (String[] args) {
			try{
				System.out.println( metodo ( ) ) ;
			} catch(Exception e) {
				System.err.println("Excepcion en metodo ( ) " ) ;
				e.printStackTrace();
			}
		}
}
