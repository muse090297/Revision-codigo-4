package com.generation;

import java.util.Scanner; //importamos la libreria Scanner

public class Codigo4 {
	public static void main(String[] args) {

	Scanner s = new Scanner(System.in); // Añadimos System.in

	System.out.printf("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	
	String j1 = s.nextLine(); //Capturamos la respuesta del jugador 1

	System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	//Scanner s2 = new Scanner(System.in); No es necesario definir un segundo Scanner
	String j2 = s.nextLine();

	if(j1.equals(j2)){ //Eliminamos el parentesis de mas, no podemos comparar cadenas string con ==
		System.out.println("Empate");
	}
	else
	{
      int g = 2;
      switch(j1) 
      {
	        case "piedra":
	          if (j2.equals("tijeras")) { // Cambiamos  == "tijeras" por .equals("tijeras")
	            g = 1;
	          }
	          break; //Añadimos el brake
	
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1; } //añadimos la llave que falta y Cambiamos  == "piedra" por .equals("piedra")
	          break; //Añadimos el brake
	          
	        case "tijeras": //Añadimos la s
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	          
	        default:
	        	System.out.println("La entrada" + j1 + " no es valida ");
	    }//switch
	      System.out.println("Gana el jugador " + g);
    }//else
  
	}//main
}// class
