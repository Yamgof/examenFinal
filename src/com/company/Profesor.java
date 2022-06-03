package com.company;

import java.util.Vector;

public class Profesor extends Persona{

    private final int numeroMaximo = 3;
    private boolean esDoctor;


    public Profesor(String dni, String nombre, String apellido, String email, Vector<Asignatura> asisgnaturas, boolean esDoctor) {
        super(dni, nombre, apellido, email, asisgnaturas);
        this.esDoctor = esDoctor;
    }

    public Profesor() {}

    public boolean isEsDoctor() {
        return esDoctor;
    }

    public void setEsDoctor(boolean esDoctor) {
        this.esDoctor = esDoctor;
    }

    @Override
    public void nuevaAsignatura(Asignatura a) {
        Vector <Asignatura> nuevaAsignatura = getAsisgnaturas();

        if (getAsisgnaturas().size()>=numeroMaximo){

            System.out.println("no puedes impartir en mas asignaturas");
        }
        else {

            nuevaAsignatura.add(a);
            System.out.println("asignatura asignada");
        }
    }

    @Override
    public void mostrardatos() {
            System.out.println("dni= "+getDni());
            System.out.println("nombre= "+getNombre());
            System.out.println("apellidos= "+getApellido());
            System.out.println("Email= "+getEmail());
            if (esDoctor){
                System.out.println("tiene doctorado");
            }
            else {
                System.out.println("no tiene doctorado");
            }
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
