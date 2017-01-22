import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {
    
      String cadena="";
        Scanner entrada=new Scanner(System.in);
        System.out.println("Cadena para analizar");
        cadena=entrada.next();
        descendente des=new descendente();
        des.Desciende(cadena+"$");
    }
    
}