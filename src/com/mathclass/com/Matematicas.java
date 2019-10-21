package com.mathclass.com;
import java.lang.Math;

public class Matematicas {

	static public void main(String[] hola) {
		
		int numero = Math.decrementExact(0);
			
		//imprime PI
		System.out.println("Valor de pi: "+Math.PI);
		
		//imprime -1
		System.out.println("Imprime el decremento entre 0 y 1"+numero); 
		
		//imprime euler
		System.out.println("El valor denumero de euler: "+Math.E); 	
		
		//regresa el numero minimo entre los dos parametros
		System.out.println("El numero menor entre 100 y 22: "+Math.min(100, 22)); 
		
		//imprime el numero maximo entre los dos parametros
		System.out.println("El numero mayor entre 100 y 22: "+Math.max(100, 22)); 
		
		//imprime el numero redondeado pero hacia abajo
		System.out.println("2.4 redondeado hacia abajo: "+Math.floor(2.4)); 
		
		//imprime el numero mandado en el argumento a la potencia de euler
		System.out.println("El numero 2 elevado a la potencia de euler"+Math.exp(2));	
		
	}
}
