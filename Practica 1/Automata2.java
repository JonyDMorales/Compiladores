public class Automata2{
	char cad[];
	int i;

	public void inicio(String c){
		cad = c.toCharArray();
		i = 0;
		q0();
	}

	public void q0(){
		System.out.println("q0");
		if (i< cad.length) {
			if (cad[i]=='b') {
				i++;
				q0();
			}
			if (cad[i]=='a') {
				i++;
				q1();
			}
		}
		if(i== cad.length){
			System.out.println("La cadena no es valida :(");
			System.exit(0);
		}
	}

	public void q1(){
		System.out.println("q1");
		if (i<cad.length) {
			if (cad[i]=='a') {
				i++;
				q2();
			}
			if (cad[i]=='b') {
				i++;
				q5();
			}
		}
		if(i== cad.length){
			System.out.println("La cadena no es valida :(");
			System.exit(0);
		}
	}

	public void q2(){
		System.out.println("q2");
		if (i<cad.length) {
			if (cad[i]=='a') {
				i++;
				q3();
			}
			if (cad[i]=='b') {
				i++;
				q4();
			}
		}
		if(i== cad.length){
			System.out.println("La cadena no es valida :(");
			System.exit(0);
		}
	}

	public void q3(){
		System.out.println("q3");
		if (i< cad.length) {
			if (cad[i]=='a') {
				i++;
				q3();
			}
			if (cad[i]=='b') {
				i++;
				q4();
			}
		}
		if(i== cad.length){
			System.out.println("La cadena es valida :)");
			System.exit(0);
		}
	}

	public void q4(){
		System.out.println("q4");
		if (i< cad.length) {
			if (cad[i]=='a') {
				i++;
				q6();
			}
			if (cad[i]=='b') {
				i++;
				q7();
			}
		}
		if(i== cad.length){
			System.out.println("La cadena es valida :)");
			System.exit(0);
		}
	}

	public void q5(){
		System.out.println("q5");
		if (i< cad.length) {
			if (cad[i]=='a') {
				i++;
				q6();
			}
			if (cad[i]=='b') {
				i++;
				q7();
			}
		}
		if(i== cad.length){
			System.out.println("La cadena no es valida :(");
			System.exit(0);
		}
	}

	public void q6(){
		System.out.println("q6");
		if (i< cad.length) {
			if (cad[i]=='a') {
				i++;
				q2();
			}
			if (cad[i]=='b') {
				i++;
				q5();
			}
		}
		if(i== cad.length){
			System.out.println("La cadena es valida :)");
			System.exit(0);
		}
	}

	public void q7(){
		System.out.println("q7");
		if (i< cad.length) {
			if (cad[i]=='a') {
				i++;
				q1();
			}
			if (cad[i]=='b') {
				i++;
				q0();
			}
		}
		if(i== cad.length){
			System.out.println("La cadena es valida :)");
			System.exit(0);
		}
	}

}