package TryCatch;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTesting {

    public static void main(String[] args) {
        while (true){
            System.out.println("Skriv et tal");
            Scanner s = new Scanner(System.in);
            int tal = s.nextInt();

            try{
                System.out.println(100/tal);
            }catch (ArithmeticException e){
                System.out.println("Du må ikke dividere med nul, prøv igen! Fejlkode: " + e );
            }catch (InputMismatchException i){
                System.out.println("Du har enten intastet et bogstav eller også er tallet for stort, fejlkode: " + i);
            }catch (Exception e){
                System.out.println("Send venligst denne fejlkode videre: "+e);
            }
            if (tal== 300){break;}

        }
    }

}
