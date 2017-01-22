import java.util.Scanner;

public class Practica1segundo{

	public static void main(String[] args) {
		Automata2 a = new Automata2();
		Scanner sc = new Scanner(System.in);
		String cad; 
		System.out.println("Introduce la cadena:");
		cad = sc.nextLine();
		a.inicio(cad);	
	}

}