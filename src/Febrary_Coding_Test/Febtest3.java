package Febrary_Coding_Test;

import java.util.Scanner;

public class Febtest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] arr = new int[testCase];
        for(int i=0;i<testCase;i++){
            arr[i] = sc.nextInt();
        }
        int arrSumLeft = 0;
        int arrSumRight = 0;
        int i;
        int notFound = -1;
        for(i=1;i<testCase-1;i++){
            for(int j=0;j<i;j++){
                arrSumLeft += arr[j];
            }
            for(int j=i+1;j<testCase;j++){
                arrSumRight += arr[j];
            }
            if(arrSumLeft == arrSumRight){
                notFound = 0;
                System.out.println(i+1);
                break;
            }
            arrSumLeft = 0;
            arrSumRight = 0;
        }
        if(testCase == 1){
            System.out.println(testCase);
        }
        else if(notFound == -1){
            System.out.println(notFound);
        }

    }

}
