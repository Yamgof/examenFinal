package com.company;

import java.util.Vector;

public abstract class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private Vector<Asignatura> asisgnaturas;

    public Persona(String dni, String nombre, String apellido, String email, Vector<Asignatura> asisgnaturas) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.asisgnaturas = asisgnaturas;
    }

    public Persona(){}

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Vector<Asignatura> getAsisgnaturas() {
        return asisgnaturas;
    }

    public void setAsisgnaturas(Vector<Asignatura> asisgnaturas) {
        this.asisgnaturas = asisgnaturas;
    }

    public abstract void nuevaAsignatura(Asignatura a);

    public abstract void mostrardatos();
}
