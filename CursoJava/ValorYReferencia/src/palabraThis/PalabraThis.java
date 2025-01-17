package palabraThis;

public class PalabraThis {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Mateo", "Cava");
        System.out.println("persona = " + persona);
        
        System.out.println(" persona nombre = " + persona.nombre);
        System.out.println(" persona apellido = " + persona.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this: " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir: " + persona);
        System.out.println("impresion del objeto actual: " + this);
    }
}
