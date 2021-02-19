import javax.lang.model.util.ElementScanner14;

public class Piezas {
    
    public Central piezaCentral [];
    public Lateral piezaLateral [];
    public Esquina piezaEsquina [];

    public Piezas (){
        piezaCentral = new Central[6];
        for (int i = 0; 1 < piezaCentral.length ; i++){
            piezaCentral[1] = new Central();

        }

        piezaLateral = new Lateral[6];
        for (int i = 0; 1 < piezaLateral.length ; i++){
            piezaLateral[1] = new Lateral();
            
        }

        piezaEsquina = new Esquina[6];
        for (int i = 0; 1 < piezaEsquina.length ; i++){
            piezaEsquina[1] = new Esquina();
            
        }


    
    }

    public char quienCentral (char orient){
        boolean esta = false;
        char color = ' '  ;
        int i = 0;
        int j = 0;
        while (i < piezaCentral.length && !esta){
            j = 0;
            while (j< piezaCentral [i].tupla.orien.length && !esta){
               if (piezaCentral[i].tupla.orien[j] == orient) {
                   esta = true;
                   color = piezaCentral[i].tupla.color[j];

               }
               else
                j++;


            }
            i++;
        }
        return color;

    }

    public char quienLateral(char orient1, char orient2, char orientColor)
    {
        boolean esta = false;
        boolean pos1 = false;
        boolean pos2 = false;
        int i=0;
        int j=0;
        int k=0;
        char color = ' '  ;
        while (i < piezaLateral.length && !esta)
        {
            j = 0;
            while (j< piezaLateral [i].tupla.orien.length && !pos1)
            {
               if (piezaLateral[i].tupla.orien[j] == orient1) 
               {
                   pos1 = true;
               }
               else
                j++;

            }
            k=0;
            while (k < piezaLateral[i].tupla.orien.length && !pos2)
            {
                if (piezaLateral[i].tupla.orien[k] == orient2)
                {
                    pos2 = true;
                }
                else
                    k++;
            }
            if (pos1 && pos2) 
            {
                if (orient1 == orientColor)
                    color = piezaLateral[i].tupla.color[j];
                else
                    color = piezaLateral[i].tupla.color[k];
                esta = true;


                
            }
            else { pos1 = false; pos2 = false; i++;}
        
    
    }
    return color;

    }

    public char quienEsquina(char orient1, char orient2, char orient3, char orientColor)
    {
        boolean esta = false;
        boolean pos1 = false;
        boolean pos2 = false;
        boolean pos3 = false;
        int i=0, j=0, k=0, l=0;
        char color =  ' ' ;

        while (i < piezaEsquina.length && !esta) {
            
        }
        j = 0;
            while (j< piezaEsquina[i].tupla.orien.length && !pos1)
            {
               if (piezaEsquina[i].tupla.orien[j] == orient1) 
               {
                   pos1 = true;
               }
               else
                j++;

            }

            k=0;
            while (k < piezaEsquina[i].tupla.orien.length && !pos2) 
            {
                if (piezaEsquina[i].tupla.orien[k] == orient2) 
                {
                    pos2 = true;
                    
                }
                else
                    k++;
            

            l=0;
            while (l < piezaEsquina[i].tupla.orien.length && !pos3) 
            {
                if (piezaEsquina[i].tupla.orien[l] == orient3)
                 {
                     pos3 = true;
                    
                }
                else
                    l++;
                
            }

            if (pos1 && pos2 && pos3)
             {
                 if (orient1 == orientColor)
                    color = piezaEsquina[i].tupla.color[j];
                else
                if(orient2 == orientColor)
                    color = piezaEsquina[i].tupla.color[k];
                else
                    color = piezaEsquina[i].tupla.color[l];
                esta = true;
                
            }
            else { pos1 = false; pos2 = false; pos3 = false;i++;}
        }
        return color;


    }
    public void imprimePiezas() {
        System.out.println("    " + quienEsquina('U', 'L', 'B', 'U') + quienLateral('U', 'B', 'U') + quienEsquina('U', 'R', 'B', 'U'));
        System.out.println("    " + quienLateral('U', 'L', 'U') + quienCentral('U') + quienLateral('U', 'R', 'U'));
        System.out.println("    " + quienEsquina('U', 'F', 'L', 'U') + quienLateral('U', 'F', 'U') + quienEsquina('U', 'F', 'R', 'U'));
        System.out.print("" + quienEsquina('L', 'U', 'B', 'L') + quienLateral('L', 'U', 'L') + quienEsquina('L', 'U', 'F', 'L') + " ");
        System.out.print("" + quienEsquina('F', 'U', 'L', 'F') + quienLateral('F', 'U', 'F') + quienEsquina('F', 'U', 'R', 'F') + " ");
        System.out.print("" + quienEsquina('F', 'U', 'R', 'R') + quienLateral('R', 'U', 'R') + quienEsquina('R', 'U', 'B', 'R') + " ");
        System.out.println("" + quienEsquina('B', 'U', 'R', 'B') + quienLateral('B', 'U', 'B') + quienEsquina('B', 'U', 'L', 'B') + " ");
        System.out.print("" + quienLateral('L', 'B', 'L') + quienCentral('L') + quienLateral('L', 'F', 'L') + " ");
        System.out.print("" + quienLateral('L', 'F', 'F') + quienCentral('F') + quienLateral('F', 'R', 'F') + " ");
        System.out.print("" + quienLateral('F', 'R', 'R') + quienCentral('R') + quienLateral('R', 'B', 'R') + " ");
        System.out.println("" + quienLateral('R', 'B', 'B') + quienCentral('B') + quienLateral('L', 'B', 'B') + " ");
        System.out.print("" + quienEsquina('L', 'D', 'B', 'L') + quienLateral('L', 'D', 'L') + quienEsquina('L', 'D', 'F', 'L') + " ");
        System.out.print("" + quienEsquina('F', 'D', 'L', 'F') + quienLateral('F', 'D', 'F') + quienEsquina('F', 'D', 'R', 'F') + " ");
        System.out.print("" + quienEsquina('F', 'D', 'R', 'R') + quienLateral('R', 'D', 'R') + quienEsquina('R', 'D', 'B', 'R') + " ");
        System.out.println("" + quienEsquina('B', 'D', 'R', 'B') + quienLateral('B', 'D', 'B') + quienEsquina('B', 'D', 'L', 'B') + " ");
        System.out.println("    " + quienEsquina('D', 'L', 'F', 'D') + quienLateral('D', 'F', 'D') + quienEsquina('D', 'F', 'R', 'D'));
        System.out.println("    " + quienLateral('D', 'L', 'D') + quienCentral('D') + quienLateral('D', 'R', 'D'));
        System.out.println("    " + quienEsquina('D', 'L', 'B', 'D') + quienLateral('D', 'B', 'D') + quienEsquina('D', 'R', 'B', 'D'));
        System.out.println("");
    }
    
}








