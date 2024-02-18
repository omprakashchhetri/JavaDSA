/*
    Pattern : Hollow Box
    INPUT : 6
    OUTPUT: 
            * * * * * *
            *         *
            *         *
            *         *
            * * * * * *

*/

import java.util.Scanner;
public class HollowBox {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sp = num-2, st=num;
        int num_of_line = 1;
        while ( num_of_line < num ){
            
            if( num_of_line == 1 || num_of_line == num-1 ){
            // Print Star
                for( int i = 0 ; i < st ; i++ ){
                    System.out.print(" * ");
                }
            }else {
                // Print Space
                System.out.print(" * ");
                for( int i = 0 ; i < sp ; i++ ){
                    System.out.print("   ");
                }
                System.out.print(" * ");
            
            }
            System.out.println();

            num_of_line++;
        }        
        sc.close();
    }
}
