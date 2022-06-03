package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        menu();
    }

    public static void menu(){

        Scanner scr = new Scanner(System.in);
        int opcion= 0;
        gestion gestionar = new gestion();

        while (opcion!=4) {
            System.out.println("elige un ade estas opciones");
            System.out.println("1. opciones asignatura");
            System.out.println("2. opciones profesorado");
            System.out.println("3. opciones alumnado");
            System.out.println("4. finalizar");

            System.out.print("introduce la opcion= ");
            opcion = scr.nextInt();

            if (opcion<1||opcion>4){

                System.out.println("vuelva a añadir una opcion");
            }

            switch (opcion){

                case 1:
                    gestionar.asignaturas();
                    break;

                case 2:
                    gestionar.profesor();
                    break;

                case 3:
                    gestionar.alumno();
                    break;
            }
        }

    }
}
