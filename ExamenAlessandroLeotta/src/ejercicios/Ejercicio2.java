package ejercicios;
import java.util.*;

public class Ejercicio2 {
	public static void main(String[] args) {
		int numero;
		int ladoX = 0;
		int ladoY = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el tamaño de tu ventana: ");
		numero = sc.nextInt();
		if(numero % 2 == 1 && numero > 10) {
			ladoX = numero;
			ladoY = ladoX / 2;
		}
		for(int i = 0; i <= ladoX; i++) {
			System.out.print("*");
			for(int j = 0; i == ladoX && j < ladoY; j++) {
				System.out.println("\n*");
				while(true) {
					System.out.print(" ");
					}
				}
			}
		sc.close();
	}
}