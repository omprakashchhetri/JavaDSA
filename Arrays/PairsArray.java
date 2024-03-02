/*
    arr[] = {2,3,4,5,6,7}
    Output : 
            (2 3)(2 4)(2 5)(2 6)(2 7)
            (3 4)(3 5)(3 6)(3 7)
            (4 5)(4 6)(4 7)
            (5 6)(5 7)
            (6 7)
            Total no. of pairs : 15
 */

public class PairsArray {
    public static void arrayPairs(int []arr){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                System.out.print("("+arr[i] +" "+ arr[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total No. of pairs : "+count);
    }
    public static void main(String []args){
        int arr[] = {2,3,4,5,6,7};
        arrayPairs(arr);
    }
}
