
public class descenso {
    char pal[];
    int i;

    public void inicio(String c){
        pal = c.toCharArray();
        i = 0;
        G();
    }

    public void G(){
        System.out.println("G()");
        if (i< pal.length) {
            if (pal[i]=='u') {
                S();
            }
        }
        if(i== pal.length){
            System.out.println("La cadena es valida");
            System.exit(0);
        }
    }

    public void S(){
        System.out.println("S()");
        if (i<pal.length) {
            if (pal[i]=='u') {
                i++;
                B();
                D();
            }
            if (pal[i]=='z') {
                i++;
            }
            else{
                System.out.println("La cadena no es valida");
                System.exit(0);
            }
        }
        else{
            System.out.println("La cadena no es valida");
            System.exit(0);
        }
    }

    public void B(){
        System.out.println("B()");
        if (i<pal.length) {
            if (pal[i]=='w') {
                i++;
                C();
            }
            else{
                System.out.println("La cadena no es valida");
                System.exit(0);
            }
        }
        else{
            System.out.println("La cadena no es valida");
            System.exit(0);
        }
    }

    public void C(){
        System.out.println("C()");
        if (i< pal.length) {
            if (pal[i]=='v') {
                i++;
                C();
            }
            if (pal[i]=='x'||pal[i]=='y'||pal[i]=='z') {
                return;
            }
            else{
                System.out.println("La cadena no es valida");
                System.exit(0);
            }
        }
        else{
            System.out.println("La cadena no es valida");
            System.exit(0);
        }
    }

    public void D(){
        System.out.println("D()");
        if (i< pal.length) {
            if (pal[i]=='x'||pal[i]=='y') {
                i++;
                E();
                F();
            }
            if (pal[i]=='z') {
                return;
            }
            else{
                System.out.println("La cadena no es valida");
                System.exit(0);
            }
        }
        else{
            System.out.println("La cadena no es valida");
            System.exit(0);
        }
    }

    public void E(){
        System.out.println("E()");
        if (i< pal.length) {
            if (pal[i]=='x'||pal[i]=='y') {
                i++;
            }
            if (pal[i]=='z') {
                return;
            }
            else{
                System.out.println("La cadena no es valida");
                System.exit(0);
            }
        }
        else{
            System.out.println("La cadena no es valida");
            System.exit(0);
        }
    }

    public void F(){
        System.out.println("D()");
        if (i< pal.length) {
            if (pal[i]=='x') {
                i++;
            }
            if (pal[i]=='z') {
                return;
            }
            else{
                System.out.println("La cadena no es valida");
                System.exit(0);
            }
        }
        else{
            System.out.println("La cadena no es valida");
            System.exit(0);
        }
    }
}