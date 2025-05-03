package com.alura.challenge.principal;

import com.alura.challenge.modelos.CalculadoraDeCambio;
import com.alura.challenge.modelos.ConsultaApi;
import com.alura.challenge.modelos.TipoDeCambio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CalculadoraDeCambio calculo = new CalculadoraDeCambio();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;


        while(opcion != 7){
            System.out.println("*************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =)\n\n" );
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar ");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar ");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar ");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida:");
            System.out.println("*************************************");

            while(!scanner.hasNextInt()){
                System.out.println("Valor ingresado no es un número. Debe ingresar un número entre 1 y 7, de acuerdo a las opciones del menú");
                scanner.next();
            }

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6){
                System.out.println("Ingrese el valor que deseas convertir");
                double cantidad = scanner.nextDouble();
                String resultado = calculo.calcular(opcion, cantidad);
                System.out.println(resultado);
            } else if(opcion == 7) {
                System.out.println("Cerrando sistema");
            } else {
                System.out.println("Opción no válida. Ingrese una opción de acuerdo al menú");
            }
        }


    }

}
