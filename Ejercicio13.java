import java.util.*;

public class Ejercicio13 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numero1;
		int numero2;
		int suma;
		double division;
		int opcionusuario;
		do {
			System.out.println("Elija la operacion que desea realizar");
			System.out.println("1. Suma");
			System.out.println("2. Division");
			System.out.println("3. Salir");
			opcionusuario = scanner.nextInt();
			if (opcionusuario!=3) {
				System.out.println("Ingrese el primer numero");
				numero1 = scanner.nextInt();
				System.out.println("Ingrese el segundo numero");
				numero2 = scanner.nextInt();
				switch (opcionusuario) {
				case 1:
					suma = numero1+numero2;
					System.out.println("La suma es "+suma);
					break;
				case 2:
					if (numero2==0) {
						System.out.println("Error no se puede dividir por 0");
					} else {
						division = (double)numero1/numero2;
						System.out.println("El resultado de la division es "+division);
					}
					break;
				default:
					System.out.println("Error opcion incorrecta");
				}
			}
		} while (opcionusuario!=3);
	}

}

