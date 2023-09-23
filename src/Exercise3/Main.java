package Exercise3;

import java.util.Scanner;

public class Main {
//	Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//	números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//	para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//	una división con los dos numeros y mostrar el resultado.
	public static void main(String[] args) {
	
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese numero 1");
		String num1 = leer.next();
		System.out.println("Ingrese numero 2");
		String num2 = leer.next();
		int num1int =Integer.parseInt(num1);
		int num2int =Integer.parseInt(num2);
		DivisionNumero division = new DivisionNumero(num1int,num2int);
		try {
			double numero= division.dividir();
			System.out.println("La division es: "+ numero);
		}catch (Exception e) {
			System.out.println("No es posible dividir por cero");
		}finally {
			division.setNum2(1);
			System.out.println("La division es: "+ (division.getNum1()/division.getNum2()));
		}
		
		
		
		
		
		

	}

}
