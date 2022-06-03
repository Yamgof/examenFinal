package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class gestion {

    private ArrayList<Profesor> listarp = new ArrayList<>();
    private ArrayList<Alumno> listara = new ArrayList<>();

    public gestion (){

        this.listarp=listarprofesores();
        this.listara=listaralumnos();
    }

    public void asignaturas(){


        Scanner scr = new Scanner(System.in);
        ColeccionAsignaturas nueva=new ColeccionAsignaturas();
        int opcion= 0;

        while (opcion!=3) {
            System.out.println("elige un ade estas opciones");
            System.out.println("1. listar todas las asignaturas");
            System.out.println("2. listar asignaturas de un curso");
            System.out.println("3. volver al menu principal");
            System.out.print("introduce la opcion= ");
            opcion = scr.nextInt();

            if (opcion<1||opcion>3){

                System.out.println("vuelva a añadir una opcion");
            }

            switch (opcion){

                case 1:
                    nueva.todasAsignaturas();
                    break;

                case 2:
                    int curso=0;
                    while (curso!=1&&curso!=2){

                        System.out.print("de que curso quieres ver las aignaturas solo esta curso 1 y 2= ");
                        curso=scr.nextInt();
                        if (curso==1||curso==2){
                            nueva.asignaturaCurso(curso);
                        }
                        else {


                            System.out.println("no valido");
                        }
                    }
                    break;

            }
        }
    }

    public void profesor (){

        Scanner scr = new Scanner(System.in);
        ColeccionAsignaturas nueva=new ColeccionAsignaturas();
        int opcion= 0;
        int codigoprofesor=-1;

        while (opcion!=3) {
            System.out.println("elige una de estas opciones");
            System.out.println("1. listar asignatura que imparte un profesor");
            System.out.println("2. asignarle nueva asignatura");
            System.out.println("3. volver al menu principal");
            System.out.print("introduce la opcion= ");
            opcion = scr.nextInt();

            if (opcion<1||opcion>3){

                System.out.println("vuelva a añadir una opcion");
            }

            System.out.println("elige profesor que quieres gestionar primero 0 o segundo 1");
            for (Profesor i:listarp) {

                i.mostrardatos();
                System.out.println();

            }
            while (codigoprofesor!=0&&codigoprofesor!=1) {
                codigoprofesor = scr.nextInt();
                if (codigoprofesor<0||codigoprofesor>1)
                {
                    System.out.println("profesor no valido");
                }
            }

            switch (opcion){

                case 1:
                    if (listarp.get(codigoprofesor).getAsisgnaturas().size()==0)
                    {
                        System.out.println("sin asignaturas aun");
                    }
                    else {

                        for (Asignatura i:listarp.get(codigoprofesor).getAsisgnaturas()) {

                            System.out.println(i);
                            System.out.println();
                        }
                    }
                    break;

                case 2:
                    int codigoasignatura= -1;
                    nueva.todasAsignaturas();
                    while (codigoasignatura<0||codigoasignatura>nueva.getListadoAsignatura().size()-1){
                    System.out.println("que asignatura quieres añadir a este profesor por su codigo");
                    codigoasignatura=scr.nextInt();
                    codigoasignatura-=1;
                    if (codigoasignatura<0||codigoasignatura>nueva.getListadoAsignatura().size()-1)
                    {
                        System.out.println("asignatura no valida");
                    }
                    }
                    listarp.get(codigoprofesor).nuevaAsignatura(nueva.getListadoAsignatura().get(codigoasignatura));


                    break;

            }
        }
    }

    public void alumno(){

        Scanner scr = new Scanner(System.in);
        ColeccionAsignaturas nueva=new ColeccionAsignaturas();
        int opcion= 0;
        int codigoprofesor=-1;

        while (opcion!=3) {
            System.out.println("elige una de estas opciones");
            System.out.println("1. Listar las asignaturas en que está matriculado el alumno");
            System.out.println("2. Matricularse de una nueva asignatura");
            System.out.println("3. volver al menu principal");
            System.out.print("introduce la opcion= ");
            opcion = scr.nextInt();

            if (opcion<1||opcion>3){

                System.out.println("vuelva a añadir una opcion");
            }

            System.out.println("elige el alumno que quieres gestionar primero 0 o segundo 1");
            for (Alumno i:listara) {

                i.mostrardatos();
                System.out.println();

            }
            while (codigoprofesor!=0&&codigoprofesor!=1) {
                codigoprofesor = scr.nextInt();
                if (codigoprofesor<0||codigoprofesor>1)
                {
                    System.out.println("alumno no valido");
                }
            }

            switch (opcion){

                case 1:
                    if (listara.get(codigoprofesor).getAsisgnaturas().size()==0)
                    {
                        System.out.println("sin asignaturas aun");
                    }
                    else {

                        for (Asignatura i:listara.get(codigoprofesor).getAsisgnaturas()) {

                            System.out.println(i);
                            System.out.println();
                        }
                    }
                    break;

                case 2:
                    int codigoasignatura= -1;
                    nueva.todasAsignaturas();
                    while (codigoasignatura<0||codigoasignatura>nueva.getListadoAsignatura().size()-1){
                        System.out.println("que asignatura quieres añadir a este alumno por su codigo");
                        codigoasignatura=scr.nextInt();
                        codigoasignatura-=1;
                        if (codigoasignatura<0||codigoasignatura>nueva.getListadoAsignatura().size()-1)
                        {
                            System.out.println("asignatura no valida");
                        }
                    }
                    listara.get(codigoprofesor).nuevaAsignatura(nueva.getListadoAsignatura().get(codigoasignatura));
                    break;

            }
        }
    }



    private ArrayList<Profesor> listarprofesores(){

        ArrayList<Profesor> listar = new ArrayList<>();
        Validar validacion=  new Validar();
        String dni = "33333333C";
        String email = "pepe@martos.es";

            Profesor pro1=new Profesor(dni,"Pepe","Martos Martos", email,new Vector<>(),true );
            listar.add(pro1);
        dni = "44444444D";
        email = "pepa@Lorca.es";

            Profesor pro2=new Profesor(dni,"Pepa","Lorca Lorca", email,new Vector<>(),true );
            listar.add(pro2);


        return listar;
    }

    private ArrayList<Alumno> listaralumnos(){

        ArrayList<Alumno> listar = new ArrayList<>();
        Validar validacion=  new Validar();
        String dni = "11111111A";
        String email = "Mario@Moreno.es";
        if (validacion.comprobarDNI(dni))
        {
            if (validacion.comprobarEmail(email)){
            Alumno pro1=new Alumno(dni,"Mario","Moreno Moreno", email,new Vector<>(),1);
            listar.add(pro1);}
        }
        dni = "22222222B";
        email = "maria@lopez.es";
        if (validacion.comprobarDNI(dni))
        {
            if (validacion.comprobarEmail(email)) {
                Alumno pro2 = new Alumno(dni, "Maria", "Lopez Lopez", email, new Vector<>(), 2);
                listar.add(pro2);
            }
        }

        return listar;
    }
}
