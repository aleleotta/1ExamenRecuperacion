package ejercicios;
import java.util.*;
/*Pruebas:
	Ejemplo 1												Ejemplo 2												Ejemplo 3
		Introduzca un número entero positivo: 2567				Introduzca un número entero positivo: 64317				Introduzca un número entero positivo: 26481046

		Digitos Pares: 6 2										Digitos Pares: 4 6										Digitos Pares: 6 4 0 8 4 6 2
		Suma de los dígitos pares: 8							Suma de los dígitos pares: 10							Suma de los dígitos pares: 30
	*/
public class Ejercicio1 {
	public static void main(String[] args) {
		long numero; //Numero que introduce el usuario.
		long numeroPar = 0; //Cantidad de numeros pares.
		long sumaPares = 0; //Suma de todos los digitos pares.
		Scanner sc = new Scanner(System.in); //Declaración de scanner.
		System.out.print("Introduzca un número entero positivo: "); //El programa pide al usuario el numero para introducir.
		numero = sc.nextInt(); //El usuario introduce el numero entero.
		System.out.println(); //Cortado de linea.
		if (numero > 1) { 
			System.out.print("Digitos Pares:");
		}
		while(numero > 1) {
			if(numero%2==0) { //Si la ultima cifra es par se imprimirá.
				numeroPar = numero % 10; //Registra el ultimo digito del numero introducido para luego imprimirlo.
				sumaPares = sumaPares + numeroPar; //Ocurre la suma del ultimo valor par en esta variable.
				System.out.print(" " + numeroPar); //Se imprimirá el digito correspondiente cada vez que sea par.
			}
			numero = numero / 10; //Se quita el ultimo digito del numero introducido.
		}
		System.out.println(); //Cortado de linea.
		System.out.print("Suma de los dígitos pares: " + sumaPares); //Por ultimo, se imprime la suma de todos los digitos pares.
		sc.close(); //Se cierra el scanner al final del programa.
	}
}