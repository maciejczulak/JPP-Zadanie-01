public class Szach {
    public static void firstLine(){
        for (int i=1; i<8; i++){if(i%2!=0){System.out.print("x");}else{System.out.print(" ");}
        };System.out.println("");
    }
    public static void secondLine(){
        for (int i=1; i<=8; i++){if(i%2!=0){System.out.print(" ");}else{System.out.print("x");}
        };System.out.println("");
    }

    public static void main(String[] args) {
       firstLine();
       secondLine();
       firstLine();
       secondLine();
       firstLine();
       secondLine();
       firstLine();
       secondLine();

       /* for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if((i+j)%2==0)
                System.out.print("x");
            else
                System.out.print(" ");}

        System.out.println();}

        */
    }





    }

