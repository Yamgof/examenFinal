package com.company;

import java.util.ArrayList;

public class ColeccionAsignaturas {

    private ArrayList<Asignatura> listadoAsignatura = new ArrayList<>();

    public ColeccionAsignaturas(ArrayList<Asignatura> listadoAsignatura) {
        this.listadoAsignatura = listadoAsignatura;
    }

    public ColeccionAsignaturas(){

       añadirAsignatura();
    }

    public ArrayList<Asignatura> getListadoAsignatura() {
        return listadoAsignatura;
    }

    public void setListadoAsignatura(ArrayList<Asignatura> listadoAsignatura) {
        this.listadoAsignatura = listadoAsignatura;
    }

    public void asignaturaCurso(int curso){

        ArrayList<Asignatura> nombrar= new ArrayList<>();

        for (int i=0;i<listadoAsignatura.size();i++){

            if (listadoAsignatura.get(i).getCurso()==curso){

                nombrar.add(listadoAsignatura.get(i));
            }
        }

        for (Asignatura i:nombrar) {

            System.out.println(i);
            System.out.println();

        }
    }

    public void todasAsignaturas(){

        for (Asignatura i:listadoAsignatura) {

            System.out.println(i);
            System.out.println();

        }
    }

    private void añadirAsignatura(){

        Asignatura as1 = new  Asignatura("BBDD",1);
        Asignatura as2 = new  Asignatura("Programacion",1);
        Asignatura as3 = new  Asignatura("Moviles",2);
        Asignatura as4 = new  Asignatura("Datos",2);
        listadoAsignatura.add(as1);
        listadoAsignatura.add(as2);
        listadoAsignatura.add(as3);
        listadoAsignatura.add(as4);
    }
}
