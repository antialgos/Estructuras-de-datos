import java.util.Scanner;

public class dataTypes {
    
    public static void main(String[] args) {
        int descuentoPorBidon = 20;
        int descuentoPorPago = 10;

        //VALIDACION Y OBTENCION DE DATOS
        System.out.println("Ingrese el tipo de pago, 1 para tarjeta o 0 para efectivo");
        Scanner leer = new Scanner(System.in);
        int pago = leer.nextInt();
        if (pago < 0 || pago > 1) {
            System.out.println("El pago ingresado no corresponde");
        }
        System.out.println("Ingrese la cantidad de bidones que necesita");
        int bidones = leer.nextInt();
        if (bidones < 1) {
            System.out.println("No puedes ingresar una cantidad de bidones 0 o negativo");
        } else if (bidones > 50) {
            System.out.println("No puedes comprar mas de 50 bidones");
        }
        System.out.println("Ingrese el valor por bidon");
        int precioBidon = leer.nextInt();

        System.out.println("Ingrese su nombre");
        String nombre = leer.next();

        System.out.println("Ingrese su dirección");
        String direccion = leer.next();

        //LOGICA DE LA APP
        Integer subtotal = bidones * precioBidon;
        Double total = subtotal.doubleValue();
        int totalDescuentos = 0;

        if (bidones > 5) {
            total = total-(total*0.2);
            totalDescuentos += descuentoPorBidon;
        }
        if (pago == 0) {
            total = total-(total*0.1);
            totalDescuentos += descuentoPorPago;
        }
        

        System.out.println("_______________________________________________");
        System.out.println("Nombre: "+nombre + " Dirección: " + direccion);
        System.out.println("Cantidad de bidones:" + bidones + " subtotal: " + subtotal);
        System.out.println("_______________________________________________");
        System.out.println("Descuentos: " + totalDescuentos +"%"+ " Total a pagar: " +total);

        

    }
}
