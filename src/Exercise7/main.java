package Exercise7;

public class main {
 public static void main(String[] args) throws MioException {

	 Numero num = new Numero();
	 System.out.println("¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException? 1)");
	 num.verificarNum("sentencia1 ",22); //		 sentencia_a1
	 try {
		 num.verificarNum("sentencia2 ",10);
	 } catch (MioException e){
		 num.verificarNum("sentencia3 ",24);
	 }finally {
		 num.verificarNum("sentencia4 ",28);
	}
	
	 System.out.println("¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException? 1)");
	 num.verificarNum("sentencia1 ",22); //		 sentencia_a1
	 try {
		 num.verificarNum("sentencia2 ",28);
	 } catch (MioException e){
		 num.verificarNum("sentencia3 ",24);
	 }finally {
		 num.verificarNum("sentencia4 ",28);
	}
	 
	 
	 System.out.println("GRACIAS");
}
}
