public class HollowYPattern {
    public static void main(String []args){
        int num = 5;
        int num_of_line = 1;
        int st = 2*num - 1; // Will always give an odd number ( for that extra space in the middle)
        int sp = 0;
        while(num_of_line <= 2*num){
            for(int i = 0 ; i < sp ; i++){
                System.out.print(" * ");
            }
            if(num_of_line <= num){
                System.out.print("  ");
                for(int i = 0 ; i < st ; i++){
                    System.out.print("   ");
                }
                System.out.print(" ");
            } else {
                System.out.print(" ");
            }

            for(int i = 0 ; i < sp ; i++){
                System.out.print(" * ");
            }

            if(num_of_line <= num){
                st-=2;
                sp++;
            } else if (num_of_line > num){
                sp = num;
            }
            num_of_line++;
            System.out.println();
        }
    }
}
