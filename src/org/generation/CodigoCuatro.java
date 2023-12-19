//Este codigo es acerca del juego piedra,papel o tijera, dependiendo que cual opcion se elija sera la ganadora, el codigo 
//funciona en base a las comparaciones de la opcion escrita por el usuario(s) por lo que se realiza una interaccion en los 
//diferentes casos para luego mostrar el usuario ganador.

package org.generation;

import java.util.Scanner; //importamos la clase Scanner para que se pueda utilizar sin problemas, ya que nos permite la entrada de datos primitivos

public class CodigoCuatro {

static Scanner s = new Scanner(System.in); // se agrego la clase static.
    
    public static void main(String[] args) { // se agrega la clase para poder ejecutarla para el uso de la consola
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner(System.in);
    String j2 = s.nextLine();
    
    if (j1.equals(j2)) { // Se egrego la funcion equals
      System.out.println("Empate");
      
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) { // Se agrego la funcion equals
            g = 1;
            
          } else {		// Se agrego un else para que cumpla la regla de j1 escriba piedra y j2 tijeras por logica el ganador sea el j1 y no j2
        	  g=1;
          
          }
          	break;

        case "papel":
          if (j2.equals("piedra")){ // Se agrego la funcion equals
            g = 1;
            
          } 
          
          break; 
          
        case "tijeras":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
          
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  
    }

}
