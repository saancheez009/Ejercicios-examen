package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	//Para comprobar que el código es correcto hemos introducido el número 85, y el sistema nos devuelve que hay un número par y un número impar

	public static void main(String[] args) {
		int num; //Declaramos la variable número que será el número introducido por el usuario 
		int resto = 1; //Esta variable será el resto de la división del número introducido entre i que tendrá valores de 10, 100, 1000 y así sucesivamente
		//Esto lo hacemos para descomponer el número y ver cuales son par e impares
		int par = 0; //Esta variable es igual a cada número del número introducido entre dos, si el resto de la división entre el resto y 2 es cero, el número es par
		int numDigitos = 0; //Esta variable, cuenta los números totales que tiene nuestro número y se le restan los números pares
		int impar = 0 ; //Esto es igual  a los números totales que tiene el número menos los números pares. aSÍ SABREMOS EL NÚMERO DE NÚMEROS IMPARES QUE HAY
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Por favor introduzca un número entero o mayor o igual que 0, a continuación se le mostrará el número cifras pares e impares");
		num=sc.nextInt();
		
		for(int i =10; num>=0 ; i*=10) {
		resto =num%i;
		par= (int) resto%2;
		
		if (par==0) {
			par=1;
			par++;
			
		} else if (par!=0) {
			while(num>=0) {
			num =num/10;
			numDigitos++;
			impar=numDigitos-par;
			}
			
		}
		
		System.out.println("El número tiene "+par+" números pares y "+impar+" números impares");
		
				}
		
	}
	
}
