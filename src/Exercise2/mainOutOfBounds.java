package Exercise2;

public class mainOutOfBounds {
//	Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
//	generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
//	de rango).
	public static void main(String[] args) {
		String[] arreglo= new String[2];
		arreglo[0]="Daniel";
		arreglo[1]="Betancur";
		try {
			System.out.println(arreglo[1]);
			System.out.println(arreglo[2]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Realizo una consulta Fuera de rango");
		}
	}
}
