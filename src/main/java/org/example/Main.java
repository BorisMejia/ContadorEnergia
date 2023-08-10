package org.example;

import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();


        Boolean esAdmin;
        Double tarifaEnergia;
        Integer i =0, contadorPicos=0;
        String opcion, respuestaPerfil, contrasenaIngresada;
        final String contrasena="admin123*";

        System.out.println("Bienvenido");
        System.out.print("Eres administrador? ");
        respuestaPerfil=teclado.nextLine();
        //Proceso para el login
        if(respuestaPerfil.equalsIgnoreCase("si")){
            System.out.print("Digite su contraseña: ");
            contrasenaIngresada=teclado.nextLine();
            if (contrasena.equals(contrasenaIngresada)){
                System.out.println("Eres administrador");
                //puedes actualizar la tarifa de energia
                System.out.print("Ingrese la tarifa de energia: ");
                tarifaEnergia=teclado.nextDouble();
                System.out.print("La tarifa de energia es: $"+tarifaEnergia);


            }else {
                System.out.println("Contraseña incorrecta");


            }
            } else if (respuestaPerfil.equalsIgnoreCase("no")) {
                System.out.println("Eres empresa");

            do{
                Integer aleatorio=generador.nextInt(401);
                if (aleatorio>300){
                    System.out.println("Pico detectado");
                    contadorPicos++;
                }else{
                    System.out.println("Operando Normalmente");
                }
                System.out.println(aleatorio);
                i++;
            }while (i < 30);
            System.out.println(i);
            System.out.println(contadorPicos);

            System.out.println("EPM GRANDES CLIENTES");
            System.out.println("1 --- Ver tarifa");
            System.out.println("2 --- Mostrar consumo promedio");
            System.out.println("3 --- Mostrar picos de consumo");
            System.out.println("4 --- Mostrar facturas");
            System.out.println("5 --- Salir");
            System.out.print("Ingrese el valor de la opcion que necesitas: ");
            opcion=teclado.nextLine();
            switch (opcion){
                case "1":
                    System.out.println("1");
                    break;
                case "2":
                    System.out.println("2");
                    break;
                case "3":
                    System.out.println("3");
                    break;
                case "4":
                    System.out.println("4");
                    break;
                case "5":
                    System.out.println("5");
                    break;


            }} else{
            System.out.println("Por favor ingrese un valor correcto");

        }

        esAdmin = teclado.nextBoolean();
    }

}