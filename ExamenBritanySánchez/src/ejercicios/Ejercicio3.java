package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Declaramos las variables
		String nombre; //Nombre introducido por el usuario
		int práctica;
		int problemas;
		int teórica;
		double p;
		double prob;
		double t;
		double notaF = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca el nombre del alumno: ");
		nombre=sc.nextLine();
		
		System.out.println("Nota de la parte práctica: ");
		práctica=sc.nextInt();	
		System.out.println("Nota de la parte de problemas: ");
		problemas=sc.nextInt();
		System.out.println("Nota de la parte teórica: ");
		teórica=sc.nextInt();
		
		while(práctica>0 && práctica<10 || problemas<10 && problemas>0 || teórica>0 && teórica<10 ) {
			p=0.1*práctica;
			prob= 0.5*problemas;
			t=0.4*teórica;
			notaF= p+prob+t;
			
			práctica=sc.nextInt();
			problemas=sc.nextInt();
			teórica=sc.nextInt();
			System.out.println(nombre);
			System.out.println("La nota final es: "+notaF);
		}
		System.out.println("Por favor elija una opción");
		
		switch (num)  {
		case 1:
			System.out.println("1. Nota máxima");
			break;
		case 2:
			System.out.println("2. Nota mínima");
			break;
		case 3:
			System.out.println("3. Media de las notas");
			break;

		}		
		
	}

}
