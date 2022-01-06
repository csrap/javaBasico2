package Funciones;

import java.util.Scanner;

public class GetIva {

    public static void main(String[] args) {
        //double iva = 0.21;
        //double price = 100;
        //double withIva = getPriceIva(100);
        //double withIva2 = getPriceIva(200.99);
        //System.out.println(withIva);
        //System.out.println(withIva2);
        Scanner scn = new Scanner(System.in);
        System.out.println("What value do you want to get price with IVA?: ");
        double price = scn.nextDouble();

        System.out.println(getPriceIva(price) + " price with IVA");

    }
static double IVA = 0.21;
     public static double getPriceIva(double price) {
        double getIVA  = price * IVA;
        double priceWithIVA = getIVA + price;
        return priceWithIVA;
    }


}
