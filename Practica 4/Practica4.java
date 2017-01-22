import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args) {
    
      	String cadena="";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cadena para analizar:");
        cadena = entrada.next();
        LR0 lr0 = new LR0();
        lr0.inicio(cadena);
    }
    
}