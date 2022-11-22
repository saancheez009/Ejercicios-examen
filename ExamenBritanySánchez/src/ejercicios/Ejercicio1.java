package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	//Para comprobar que el código es correcto he introducido el número 5 y el sistema devuelve
	/*		*****    
			*****    
			*****    
			*****    
			*****     */
	//Por tanto el código no está correcto.

	public static void main(String[] args) {
		
	int numColumnas;//Introducimos la variable numcolumnas que será el número de asteriscos de altura
	
	Scanner sc = new Scanner(System.in); //Introducimos e importamos el scanner para poder leer el teclado
	
	
	//Le pedimos al usuario que por favor introduzca u número, este será el número filas y columnas del rectángulo o cuadrado
	System.out.println("Para poder mostrarle la figura, por favor introduzca un número, este será el número de filas y columnas");
	numColumnas=sc.nextInt(); //Leemos el número
	
	
	//Mediante for delcramos que la base debe ser igual al número de columnas que es la altura
	 for(int base = 1; base<=numColumnas;base++){
		//introducimos otro for para que se impriman los asteriscos de acuerdo al número introducido
		 for(int asteriscos=1; asteriscos<=numColumnas; asteriscos++){
             System.out.print("*"); 
            
         }
		 //Creamos otro for dentro del anterior en el que insertaremos los espacios en blanco dentro del rectángulo
		 for(int blancos = 1; blancos<=numColumnas-1; blancos++){
           System.out.print(" "); //Ponemos un sysoutprint vacío que mostrará los espacios en blanco
        }
		 System.out.println(); 
	 }

	}

}
