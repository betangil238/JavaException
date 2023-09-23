package Exercise4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
//	Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
//	causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
//	no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
//	número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
//	utilizando bloques try/catch para las distintas excepciones
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese una letra");
		try {
			int num = leer.nextInt();
			System.out.println("El numero es: "+ num);
		}catch (InputMismatchException e) {
			System.out.println("Se ingreso una letra en lugar de un numero");
			System.out.println(e.fillInStackTrace());
		}
		
		System.out.println("Ingrese una letra diferente");
		String letra = leer.next();
		
		try {
			int number=Integer.parseInt(letra);
			System.out.println("El numero es: "+ number);
		} catch (NumberFormatException e) {
			System.out.println("intento convertir una letra a numero");
			System.out.println(e.fillInStackTrace());
		}
		System.out.println("ingrese un numero");
		int num = leer.nextInt();
		try {
			double numerito= num/0;
		} catch (ArithmeticException e) {
			System.out.println("imposible division por cero");
			System.out.println(e.fillInStackTrace());
		}
	}
}
