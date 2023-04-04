//Programa que dice si un numero es Neutro o Par/Impar Positivo o Negativo 

import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Pedimos el numero
        System.out.println("Ingresa el numero: ");
        int n = leer.nextInt();
        
        //
        if (n != 0){
            //Si es diferente a 0 analiza si es Positivo
            if(n > 0){
                //Ahora si es Par
                if(n % 2 == 0){
                    //Imprime
                    System.out.println("El numero "+n+" es PAR POSITIVO");
                }else{
                    //De lo contrario es impar
                    System.out.println("El numero "+n+" es IMPAR POSITIVO");
                }
            }else{
                //Si es menor a 0 es negativo
                if(n % 2 == 0){
                    //Si es par
                    System.out.println("El numero "+n+" es PAR NEGATIVO");
                }else{
                    //De lo contrario es impar
                    System.out.println("El numero "+n+" es IMPAR NEGATIVO");
                }
            }
        }else{
            //Si es 0 el numero es neutro
            System.out.println("El numero es NEUTRO");
        }      
    }   
}
