import java.util.Scanner;
public class Sumar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Pedimos el primer numero
        System.out.println("Ingresa el primer numero");
        var n1 = leer.nextInt();
        
        //Pedimos el segundo numero
        System.out.println("Ingresa el segundo numero");
        var n2 = leer.nextInt();
        
        //Creamos la variable r para el resultado
        var r = n1 + n2;
        //Imprimimos
        System.out.println("La suma de "+ n1 + " + "+ n2+" es igual a: "+r);
    }              
}
