package CNUACA230315;

import java.util.Scanner;

public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] num = new int[length];
        boolean isPositive = false;
        for(int i=0;i<length;i++) {
            num[i] = sc.nextInt();
            if(num[i] > 0){
                isPositive = true;
            }
        }
        if(isPositive == true){
            int psum = 0, max = 0;
            for(int i = 0; i<length; i++) {

                psum = Math.max(psum, 0) + num[i];
                max = Math.max(psum, max);

            }
            System.out.println(max);
        }
        else{
            System.out.println(MaxList(num,length));
        }





    }
    public static int MaxList(int[] list, int length){
        int result = list[0];
        for(int i=1;i<length;i++){
            if(list[i] > result){
                result = list[i];
            }
        }
        return result;
    }

}
