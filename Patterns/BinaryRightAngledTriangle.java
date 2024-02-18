/*
    Pattern : Binary Right Angled Triangle
    Input : 5
    Output :
            1 
            0  1 
            1  0  1 
            0  1  0  1 
            1  0  1  0  1 

 */

import java.util.Scanner;

public class BinaryRightAngledTriangle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num_of_line = 1;
        int st = 1;
        while( num_of_line <= num ){

            for( int i = 1 ; i <= st ; i++ ){
                if( (i+num_of_line) % 2 == 0){
                    System.out.print(" 1 ");
                }else {
                    System.out.print(" 0 ");
                }
            }
            st++;
            num_of_line++;
            System.out.println();
        }
        sc.close();
    }
}
