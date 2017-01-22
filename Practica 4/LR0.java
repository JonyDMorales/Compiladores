
public class LR0 {
    char pal[];
    int i;

    public void inicio(String c){
        pal = c.toCharArray();
        i = 0;
        I0();
    }

    public void I0(){
        System.out.println("I0()");
        if (i< pal.length) {
            if (pal[i]=='+'||pal[i]=='-') {
                I1();
            }
        }
        if(i== pal.length){
            System.out.println("La cadena es valida");
            System.exit(0);
        }
        else{
            System.out.println("La cadena no es valida");
            System.exit(0);
        }
    }

    public void I1(){
        System.out.println("I1()");
        if (i<pal.length) {
            if (pal[i]=='+'||pal[i]=='-') {
                i++;
                I2();
            }
            else{
                System.out.println("La cadena es valida");
                System.exit(0);
            }
        }
        else{
            System.out.println("La cadena es valida");
            System.exit(0);
        }
    }

    public void I2(){
        System.out.println("I2()");
        if (i==pal.length) 
            I1();
        if (i<pal.length) {
            if (pal[i]=='1'||pal[i]=='0') {
                i++;
                I2();
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