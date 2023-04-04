//Este programa da el IVA y el monto final de un producto

import java.util.Scanner;
public class PrecioVenta {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Pedimos el precio de venta
        System.out.println("Ingresa el valor de venta: ");
        var vv = leer.nextDouble();
        
        //IVA es del 16%
        var iva = vv * 0.16;
        
        //Precio de Venta
        var pv = vv+iva;
        
        System.out.println("Valor de Venta: "+vv);
        System.out.println("IVA: "+iva);
        System.out.println("Precio Final de Venta: "+pv);
    }
}
