/*
  Pattern : Y Pattern
  Input : 5
  Output :   
 *  *  *  *  *  *  *  *  *  *  * 
    *  *  *  *  *  *  *  *  * 
       *  *  *  *  *  *  * 
          *  *  *  *  * 
             *  *  * 
                * 
                * 
                * 
                * 
                * 
 */

public class YPattern {
    public static void main(String []args){
        int num = 5;
        int sp_i = num+1;
        // Will always give an odd number ( for that Star in the middle)
        int st = 2*num + 1 , sp = 1;  
        int num_of_line = 1;
        while( num_of_line <= 2*num ){
            
            for(int i = 0 ; i < sp ; i++){
                System.out.print("   ");
            }

            for(int i = 0 ; i < st ; i++ ){
               if( i == sp_i ){
                    System.out.print(" * ");
               } else {
                    System.out.print(" * ");
               }
            }

            if( num_of_line < num ){
                sp_i--;
                st-=2;
                sp++;
            } else if( num_of_line >= num) {
                sp = num;
                st = 1;
            }
            num_of_line++;
            System.out.println();
        }
    }
}
