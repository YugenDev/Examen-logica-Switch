package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner entradaTeclado= new Scanner(System.in);

        Integer opcionMenu;
        Double precioPeluche=0.0;
        String nombrePeluche="";
        Double precioVenta=0.0;

        System.out.println("BIENVENIDO A PELUCHITOS S.A.S");
        System.out.println("******************************");

        System.out.println("Señor usuario, ¿Que desea hacer?");
        System.out.println("1. Agregar un nombre y precio a un peluche");
        System.out.println("2. Calcular el precio de venta unitario definido de un peluche +IVA(19%)");
        System.out.println("3. ver informacion del nuevo peluche");
        System.out.println("4. Editar el precio de un nuevo peluche");
        System.out.println("5. SALIR");
        System.out.println("-----------------------------");


        do {

            System.out.println("digite la opcion que desee --> ");
            opcionMenu =entradaTeclado.nextInt();


            switch (opcionMenu) {

                case 1:
                    System.out.println("Digite el nombre que desee que tenga el peluche: ");
                    entradaTeclado.nextLine();
                    nombrePeluche = entradaTeclado.nextLine();

                    System.out.println("Digite el precio de este peluche: ");
                    precioPeluche = entradaTeclado.nextDouble();
                    break;

                case 2:
                    Double  iva = (19.0*precioPeluche)/100;
                    precioVenta = precioPeluche+iva;
                    System.out.println("El precio del peluche con IVA incluido es de "+precioVenta+"$");
                    
                    break;

               case 3:

                   System.out.println("El nombre del peluche es "+nombrePeluche+" y su precio de venta es de "+precioVenta+"$");
                   break;

                case 4:
                    System.out.println("Digite el nuevo precio del peluche: ");
                    precioPeluche=entradaTeclado.nextDouble();
                    break;

                default:
                    System.out.println("Opcion invalida");
            }


        } while (opcionMenu != 5);

    }
}