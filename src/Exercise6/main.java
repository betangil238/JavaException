package Exercise6;

public class main {
 public static void main(String[] args) throws MioException {

	 Numero num = new Numero();
	 System.out.println("¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException? 1)");
	 num.verificarNum("sentencia1 ",22); //		 sentencia_a1
	 num.verificarNum("sentencia2 ",20); //		 sentencia_a2
	 try {
		 num.verificarNum("sentencia3 ",10);
		 num.verificarNum("sentencia4 ",12);
	 } catch (MioException e){
		 num.verificarNum("sentencia5 ",24);
	 }
	 num.verificarNum("sentencia6 ",28);
	 
	 System.out.println("¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException? 2)");
	 num.verificarNum("sentencia1 ",22); //		 sentencia_a1
	 num.verificarNum("sentencia2 ",20); //		 sentencia_a2
	 try {
		 num.verificarNum("sentencia3 ",28);
		 num.verificarNum("sentencia4 ",12);
	 } catch (MioException e){
		 num.verificarNum("sentencia5 ",24);
	 }
	 num.verificarNum("sentencia6 ",28);
	 
	 System.out.println("¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException? 1)");
	 num.verificarNum("sentencia1 ",22); //		 sentencia_a1
	 num.verificarNum("sentencia2 ",20); //		 sentencia_a2
	 try {
		 num.verificarNum("sentencia3 ",28);
		 num.verificarNum("sentencia4 ",27);
	 } catch (MioException e){
		 num.verificarNum("sentencia5 ",56);
	 }
	 num.verificarNum("sentencia6 ",28);
	 
	 System.out.println("GRACIAS");
}
}
