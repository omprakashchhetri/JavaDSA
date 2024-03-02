public class ReverseArray {
    // Method 1: Using for (use when we know how much to run)  
    public static int[] reverseArray(int[] arr){
        int temp = 0, l = arr.length;
        int start = 0, end = l-1;
        for(int i = 0 ; i < l/2 ; i++){
            if(start <= end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start ++ ;
                end --;
            } 
        }
        return arr;
    }

    // MEthod 2: Using while (when we don't know how much to run) 
    public static void reverseArray2(int[] arr){
        int start = 0, end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {92, 66, 12, 27, 43, 72, 10, 88, 71};
        System.out.println("Before Reverse");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        reverseArray(arr);
        System.out.println("\nAfter Reverse");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
