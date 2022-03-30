/*
Chapter 5 Programming excercise 17
Riky Hernandez
9/8/21
Description: User enters an integer from 1 to 15 and displays a pyramid

──────────────▐█████───────
──────▄▄████████████▄──────
────▄██▀▀────▐███▐████▄────
──▄██▀───────███▌▐██─▀██▄──
─▐██────────▐███─▐██───██▌─
─██▌────────███▌─▐██───▐██─
▐██────────▐███──▐██────██▌
██▌────────███▌──▐██────▐██
██▌───────▐███───▐██────▐██
██▌───────███▌──▄─▀█────▐██
██▌──────▐████████▄─────▐██
██▌──────█████████▀─────▐██
▐██─────▐██▌────▀─▄█────██▌
─██▌────███─────▄███───▐██─
─▐██▄──▐██▌───────────▄██▌─
──▀███─███─────────▄▄███▀──
──────▐██▌─▀█████████▀▀────
──────███──────────────────

*/
package chapter5_19;

public class Chapter5_19 {

    
    public static void main(String[] args) {
       
               int num = 0;
                                                        //creates the spaces to make the pyramid form
               for(int row = 0; row <= 7;row++)
               {
                   
                   for(int col = 1; col <= 7-row;col++)
                   {
                       System.out.printf("%4s"," ");
                   
                   }                                       //creating the numbers going up by the power of 2 on the left side of the pyramid
                   for(int col = 0; col <= row; col++)
                   {
                       num = (int)Math.pow(2, col);
                       System.out.printf("%4d", num);
                   }
                   for(int col = row -1; col >= 0; col--)           //creating the numbers going up by the power of 2 on the left side of the pyramid
                   {
                       num = (int)Math.pow(2, col);
                       System.out.printf("%4d", num);    
                   }
                   System.out.println("");   //helps to start a new line
               }
        

    }
}    

