import java.util.Scanner;

public class Practica1primer{

	public static void main(String[] args) {
		Automata1 a = new Automata1();
		Scanner sc = new Scanner(System.in);
		String cad; 
		System.out.println("Introduce la cadena:");
		cad = sc.nextLine();
		a.inicio(cad);	
	}

}