package Exercise5;

import java.util.Scanner;

public class MainRandom {

	public static void main(String[] args) throws Exception {
		Scanner leer = new Scanner(System.in);
		int num = (int) (Math.random() * 500)+1;
		int cont=0;
		boolean flag=false;
		boolean autorizado=false;
		int numero=0;
		System.out.println(num);
		do {
			cont++;
			System.out.println("ingrese un numero");
			try {
				numero= leer.nextInt();
				autorizado=true;
			}catch (Exception e) {
				System.out.println("ingreso un dato erroneo, perdio una oportunidad");
				autorizado=false;
				leer.next();
			}
			if(autorizado && numero>num) {
				System.out.println("Ingrese un numero menor");
			}else if(autorizado && numero<num) {
				System.out.println("Ingrese un numero mayor");
			}else if(autorizado &&  numero == num ){
				System.out.println("felicitaciones, acerto el numero");
				flag=true;
			}
		}while (flag==false);
		System.out.println("Se adivino el numero al intento " + cont);

	}

}
