/*
    Pattern : Hollow Butterfly
    input: 3
    output : 

        *       *
        * *   * *
        *  * *  *
        *  * *  *
        * *   * *
        *       *
 */

public class HollowButterfly {
    public static void main(String []args){
        int num = 3;
        int num_of_line = 1;
        int st = 1, sp = 2*num-2;
        while( num_of_line <= 2*num ){
           for( int i = 0 ; i < st ; i++ ){
            if( i == 0 || i == st-1 ){
                System.out.print(" * ");
            } else { 
                System.out.print("   ");
            }
           }
           for( int i = 0 ; i < sp ; i++ ){
                System.out.print("   ");
           }
           for( int i = 0 ; i < st ; i++ ){
            if( i == 0 || i == st-1 ){
                System.out.print(" * ");
            } else { 
                System.out.print("   ");
            }           }
           if( num_of_line < num ){
                st++;
                sp-=2;
           } else if( num_of_line > num ) { 
                st--;
                sp+=2;
           }
           System.out.println();
           num_of_line++;
        }
    }
}