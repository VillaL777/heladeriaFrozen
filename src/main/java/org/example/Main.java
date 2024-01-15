package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //Declarar varibles
        String tipoHelado1= "Simple";
        String tipoHelado2= "Doble";
        String tipoHelado3= "Especial";


        double precioSimple = 2500.00;
        double precioDoble = 5000.00;
        double precioEspecial = 7000.00;

        int cantidadHeladoSimpleVendidos;
        int cantidadHeladoDoblesVendidos;
        int cantidadHeladoEspecialVendidos;
        int cantidadTotalHelados;

        System.out.println("Ingrese la Cantidad de helados simples vendidos:");
        cantidadHeladoSimpleVendidos= scanner.nextInt();
        System.out.println("Ingrese la Cantidad de helados dobles vendidos:");
        cantidadHeladoDoblesVendidos= scanner.nextInt();
        System.out.println("Ingrese la Cantidad de helados especiales vendidos: ");
        cantidadHeladoEspecialVendidos= scanner.nextInt();

        double totalVentasSimple = cantidadHeladoSimpleVendidos * precioSimple;
        double totalVentasDoble = cantidadHeladoDoblesVendidos * precioDoble;
        double totalVentasEspecial = cantidadHeladoEspecialVendidos * precioEspecial;
        double totalVentas=totalVentasSimple+totalVentasDoble+totalVentasEspecial;

        System.out.println("Ventas Diarias FROZEN Laureles");
        System.out.println("-------------------------------");
        System.out.println("Helado " + tipoHelado1 + "" + cantidadHeladoSimpleVendidos + ""
                +"Unidades-Total: $ " + totalVentasSimple);
        System.out.println("Helado " + tipoHelado2 + "" + cantidadHeladoDoblesVendidos + ""
                +"Unidades-Total: $ " + totalVentasDoble);
        System.out.println("Helado " + tipoHelado3 + "" + cantidadHeladoEspecialVendidos + ""
                +"Unidades-Total: $ " + totalVentasEspecial);
        System.out.println("Ventas Total $ :" + totalVentas);

















    }
}