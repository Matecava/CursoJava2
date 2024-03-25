package valoryreferencia;

import clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.nombre = "Pepita";
        System.out.println("Nombre = " + persona1.nombre);

        cambiaValor(persona1);

        System.out.println("Cambio = " + persona1.nombre);
    }

    public static Persona cambiaValor(Persona persona) {
        persona.nombre = "Pepito";
         return persona;
    }
}
