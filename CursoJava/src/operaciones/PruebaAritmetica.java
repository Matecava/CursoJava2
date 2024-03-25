package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        
        //Variables locales
        
        var a = 10;
        var b =8;
        miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();

        var sumarConRetorno = aritmetica1.sumarConRetorno();
        
        System.out.println("Resultado = " + sumarConRetorno);
        
        int resultado = aritmetica1.sumarConArgumentos(10, 5 );
        
        System.out.println("resultado = " + resultado);
        
        
    }
    
    public static void miMetodo(){
        //La variable fuera del main ya no sirve
        // a =10;
        System.out.println("Otro metodo");
    }
}
