package com.company;

public class Asignatura {

    private static int contador=1;
    private int codigo;
    private String nombre;
    private int curso;

    public Asignatura( String nombre, int curso) {
        this.codigo = contador++;
        this.nombre = nombre;
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return  "codigo= " + codigo +
                ", nombre= " + nombre +
                ", curso= " + curso;
    }
}
