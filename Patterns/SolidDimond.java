/*

    Pattern : Dimond Pattern
    INPUT : 4
    OUTPUT : 
           1 2 3 4 5 6 7    
    1            *
    2          * * *
    3        * * * * *
    4      * * * * * * *
    5        * * * * *
    6          * * *
    7            *

 */

import java.util.Scanner;
public class SolidDimond {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int num_of_line = 1;
        int sp = num-1, st = 1;        
        while( num_of_line < num*2 ){
            for( int i = 0 ; i < sp ; i++ ){
                System.out.print("   ");
            }
            for( int i = 0 ; i < st ; i++ ){
                System.out.print(" * ");
            }
            if( num_of_line < num ){
                st+=2;
                sp--;
            }else if( num_of_line >= num ){
                st-=2;
                sp++;
            }
            System.out.println();
            num_of_line++;
        }
        sc.close();
    }
}