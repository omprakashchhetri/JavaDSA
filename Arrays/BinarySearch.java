/*
    Time Comlexity : O(logn)
 */
public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = (start + end) / 2;
            if(arr[mid] < key){
                end = mid - 1;
            } else if(arr[mid] == key){
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void printArr(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String []args){
        int[] arr = {5,4,3,2,1};
        int key = 2;
        printArr(arr);
        System.out.println("Key: "+key);
        int index = binarySearch(arr, key);
        System.out.println("Index: "+index);
    }
}
