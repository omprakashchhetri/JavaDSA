/*
    Pattern : Hour Glass Pattern
    INPUT : 5
    OUTPUT :
             *  *  *  *  * 
                *  *  * 
                   * 
                   * 
                *  *  * 
             *  *  *  *  * 
 */

import java.util.Scanner;
public class HourGlass {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if( num % 2 == 0 ){
            num += 1;
        }
        int num_of_line = 1;
        int st = num, sp = 0;
        while( num_of_line <= num+1 ){
            // Print Spaces
            for( int i = 0 ; i < sp ; i++ ){
                System.out.print("   ");
            }
            // Print Stars
            for( int i = 0 ; i < st ; i++ ){
                System.out.print(" * ");
            }
            if( num_of_line < (num/2)+1 ){
                st-=2;
                sp++;
            } else if(num_of_line > (num/2)+1 ) {
                st+=2;
                sp--;
            }
            System.out.println();
            num_of_line++;
        }
        sc.close();
    }
}
