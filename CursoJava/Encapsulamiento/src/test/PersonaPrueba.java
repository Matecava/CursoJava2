package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Mateo", 5000, false);
        
        persona1.setNombre("Mateo Agustin");
        System.out.println("persona1 = " + persona1.getNombre());
        System.out.println("persona1 = " + persona1.isEliminado());
        System.out.println("persona1 = " + persona1.getSueldo());
        
        System.out.println("persona1 = " + persona1);
    }
}
