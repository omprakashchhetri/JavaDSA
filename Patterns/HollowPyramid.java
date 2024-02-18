/*
    Pattern : Hollow Pyramid
    INPUT : 6
                        *
                     *     *
                   *         *
                 *             *
               *                 *
             *   *   *   *    *    *
            
 */

public class HollowPyramid {
    public static void main( String []args ){
        int num = 4;
        int num_of_line = 1;
        int sp = 2*num-1, st = 1;
            while( num_of_line <= num*2  ) {
                for( int i = 0 ; i < sp ; i++ ){
                    System.out.print("  ");
                }
                for( int i = 0 ; i < st ; i++ ){
                    if( i == 0 || i == st-1 || num_of_line == 2* num){
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            sp--;
            st++;
            System.out.println();
            num_of_line++;
        }

    }
}
