import java.util.Stack;

public class descendente {
    
        Stack<String> pila = new Stack<String>();
        char[] k;
        char[] l={'a','b','c','d','e'};
        String A="";
        char[] T={'(', ')','+','-','*','/', 'i', '$'};
        char[] N={'E','e','O'};
        String [] P={"ie", "(E)e", "Oie", "l", "+", "-","*","/"};
        
        
        public descendente(){ 
            pila.push("$");
            pila.push("E");
        }
        
        public String DesciendeTabla(String Tops, char word)
        {
            System.out.println("el valor de Tops es:"+Tops+"  El valor de word es"+word);
            String Produccion="";
            if(word=='(' && Tops.equals("E"))
                 Produccion=P[1];
            else if(word=='i' && Tops.equals("E"))
                 Produccion=P[0];
            else if(word=='+' && Tops.equals("e"))
                 Produccion=P[2];
            else if(word=='-' && Tops.equals("e"))
                 Produccion=P[2];
            else if(word=='*' && Tops.equals("e"))
                 Produccion=P[2];
            else if(word=='/' && Tops.equals("e"))
                 Produccion=P[2];
            else if(word==')' && Tops.equals("e"))
                 Produccion=P[3];
            else if(word=='$' && Tops.equals("e"))
                 Produccion=P[3];
            else if(word=='+' && Tops.equals("O"))
                 Produccion=P[4];
            else if(word=='-' && Tops.equals("O"))
                 Produccion= P[5];
            else if(word=='*' && Tops.equals("O"))
                 Produccion=P[6];
            else if(word=='/' && Tops.equals("O"))
                 Produccion=P[7];
            return Produccion;
        }  
        
        
        public void Desciende(String Cadena)
        {
           char[] car=Cadena.toCharArray();
           int i=0;
           String topS=pila.lastElement();           
           char word=Cadena.charAt(0);
           while(true){
            if(car[i]=='a' || car[i]=='b'|| car[i]=='c'|| car[i]=='d')
            word='i';            
            System.out.println(pila);
            System.out.println("tope: "+topS+"  "+"Palabra: "+car[i]+"  "+"Cadena: "+Cadena+ "\n");
           if(pila.lastElement().equals("$") && word=='$')
           {   System.out.println("Valida");
               break;}
            else if(topS.equals("(")|| topS.equals(")") || topS.equals("+")|| topS.equals("-")|| topS.equals("*")|| topS.equals("/")|| topS.equals("i")|| topS.equals("$"))
            {
                if(topS.equals(String.valueOf(word)))
                {
                    pila.pop();
                    i=i+1;                    
                    word=Cadena.charAt(i);
                    if(word=='a' || word=='b' || word=='c' || word=='d')
                    word='i';   
                }
                else{
                System.out.println("No valida");
                break;
                }            
            }
            else if(topS.equals("l"))
                pila.pop();
            //falta un else
            else
                if(topS.equals("E") || topS.equals("e")|| topS.equals("O"))
                {
                A=DesciendeTabla(topS,word);
                int k=A.length();
                pila.pop();                
                     while(k>0)
                    {   pila.push(String.valueOf(A.charAt(k-1)));   
                    k-=1;
                    }
                System.out.print(pila);

                }
               topS=pila.lastElement();
               
           }
        
        
        }

}
