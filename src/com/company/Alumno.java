package com.company;

import java.util.Vector;

public class Alumno extends Persona {

    private final int numeroMaximo=10;
    private int curso;

    public Alumno(String dni, String nombre, String apellido, String email, Vector<Asignatura> asisgnaturas, int curso) {
        super(dni, nombre, apellido, email, asisgnaturas);
        this.curso=curso;
    }

    public Alumno(){}

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public void nuevaAsignatura(Asignatura a) {

        Vector <Asignatura> nuevaAsignatura = getAsisgnaturas();

        if (getAsisgnaturas().size()>=numeroMaximo||a.getCurso()!=curso){

            System.out.println("no puedes matricularte en mas asignaturas o no es una asignatura de tu curso");
        }
        else {

            nuevaAsignatura.add(a);
            System.out.println("asignatura matriculada");
        }
    }

    @Override
    public void mostrardatos() {
        System.out.println("dni= "+getDni());
        System.out.println("nombre= "+getNombre());
        System.out.println("apellidos= "+getApellido());
        System.out.println("Email= "+getEmail());
        System.out.println("curso= "+getCurso());
        System.out.println("asignaturas= ");
        if (getAsisgnaturas().size()==0){
            System.out.println("sin asignaturas aun");
        }
        else {
            for (Asignatura i : getAsisgnaturas()) {
                System.out.println(i);
                System.out.println();
            }
        }
    }
}
