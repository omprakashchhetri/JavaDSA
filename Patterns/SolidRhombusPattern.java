/*
    Pattern : Solid Rhombus Pattern
    INPUT : 5
    OUTPUT :       
               * * * * *
             * * * * *
           * * * * *
         * * * * *
       * * * * *

 */

import java.util.Scanner;

public class SolidRhombusPattern {
    public static void main(String []args){
        Scanner snc = new Scanner(System.in);
        int num = snc.nextInt();

        int numOfLine = 1;
        while( numOfLine <= num ){
            // Print Space
            for( int i = 0 ; i < num - numOfLine ; i++ ){
                System.out.print("  ");
            }
            // Print Star
            for( int i = 0 ; i < num ; i++){
                System.out.print(" *");
            }
            System.out.println();
            numOfLine++;
        }
        snc.close();
    }
}