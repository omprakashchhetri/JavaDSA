/*
    Time Complexity : No. of times loops operates(which is n times);
    Time Comlexity : O(n)
 */

import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int arr[], int key){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    // prints the array
    public static void printArr(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    
    public static void main(String []args){
        Scanner sc  = new Scanner(System.in);
        int key = sc.nextInt();
        int []arr = {12, 13 , 14, 15, 9};
        printArr(arr);
        System.out.println("key: "+key);
        int index = linearSearch(arr, key);
        System.out.println(index);
        sc.close();
    }
}
