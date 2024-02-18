/*
    Pattern : Hollow Rhombus Patern
    INPUT : 6
    OUTPUT:
                       *  *  *  *  *  * 
                    *              * 
                 *              * 
              *              * 
           *              * 
        *  *  *  *  *  *
 */

import java.util.Scanner;
public class HollowRhombusPattern {
    public static void main(String []args){
        Scanner snc = new Scanner(System.in);
        int num = snc.nextInt();
        int num_of_line = 1;
        int sp = num-1, st = num;
        while( num_of_line <= num ){
            for( int i = 0 ; i < sp ; i++ ){
                System.out.print("   ");
            }
            
            for( int i = 0 ; i < st ; i++  ){
                if( i == 0 || i+1 == st || num_of_line == 1 || num_of_line == num){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            num_of_line++;
            sp--;
            System.out.println();
        }
        snc.close();
    }
}
