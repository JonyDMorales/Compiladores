import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {
    
      	String cadena="";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cadena para analizar:");
        cadena = entrada.next();
        descenso des = new descenso();
        des.inicio(cadena);
    }
    
}