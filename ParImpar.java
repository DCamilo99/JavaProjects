//Programa que dice si un numero es Par o Impar

import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Pedimos el numero
        System.out.println("Ingresa el numero: ");
        int n = leer.nextInt();
        
        //Analizamos si es Par o Impar
        if (n % 2 == 0){
            //Si es divisible entre 2 es par
            System.out.println("El numero es PAR");
            //En caso de que no se cumpla la condicion es IMPAR
        }else{
            System.out.println("El numero es IMPAR");
        }      
    }   
}
