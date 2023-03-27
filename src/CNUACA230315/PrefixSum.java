package CNUACA230315;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] num = new int[length];
        for(int i=0;i<length;i++){
            num[i]=sc.nextInt();
        }
        int[] prefixSum = new int[length];
        prefixSum[0] = num[0];
        for(int i=1;i<length;i++){
            prefixSum[i] = prefixSum[i-1] + num[i];
        }

        for(int i=0;i<length;i++){
            System.out.print(prefixSum[i] + " ");
        }
    }
}
