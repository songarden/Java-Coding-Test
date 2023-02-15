package Febrary_Coding_Test;

import java.util.Scanner;

public class Febtest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numlength = sc.nextInt();
        int roll = sc.nextInt();
        int[] numArr = new int[numlength];
        for(int i=0;i<numlength;i++){
            numArr[i] = i+1;
        }
        for(int i=0;i<roll;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int tmp;
            tmp = numArr[a-1];
            numArr[a-1] = numArr[b-1];
            numArr[b-1] = tmp;
        }
        for(int i=0;i<numlength;i++){
            System.out.print(numArr[i]+" ");
        }
    }
}
