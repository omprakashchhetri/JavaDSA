/*
    Pattern: Floyeds Right Angled Triangle.
    Input   : 5
    Output  : 
        1
        2 3
        4 5 6
        7 8 9 1 0
        11 12 13 14 15
 */
import java.util.Scanner;
public class FloyedsTriangle {
    public static void main( String []args ){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num_of_line = 1, count = 1;
        while( num_of_line <= num ){
            for( int i = 0 ; i < num_of_line ; i++ ){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
            num_of_line++;
        }
        sc.close();
    }
}
