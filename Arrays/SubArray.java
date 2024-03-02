/*
 * To find the largest and smallest sum in a sub array
 */
public class SubArray {
    public static void subArray(int []arr){
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                sum = 0;
                System.out.print("[");
                for(int k = i ; k <= j ; k++){
                    // System.out.print(" "+arr[k]+" ");
                    sum = sum + arr[k];
                }
                // System.out.print("] Sum : "+ sum+"\n");
                System.out.print(" "+ sum+" ]");
                if( sum > max ){
                    max = sum;
                }
                if( sum < min ){
                    min = sum;
                }
                count++;
            }
            System.out.println();
        }
        System.out.println("Largest Sum : " + max);
        System.out.println("Smallest Sum : " + min);
        System.out.println("Total Sub Arrays : "+count);
    }
    public static void main(String []args){
        int arr[] = {-1,-4,-8,2,1,-7,-8};
        subArray(arr);
    }
}
