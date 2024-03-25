package operaciones;

public class Aritmetica {

    int a, b;
    
    //Constructo vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }

    //Metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        return a + b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
}
