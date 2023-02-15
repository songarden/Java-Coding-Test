package Febrary_Coding_Test;

import java.util.Arrays;
import java.util.Scanner;

public class Febtest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase1 = sc.nextInt();
        int i,j;
        int[] songsSecNow = new int[testCase1];
        Arrays.fill(songsSecNow, 0); //모든 리스트 0으로 채우며 초기화
        songsSecNow[0] = sc.nextInt();
        for(i=1;i<testCase1;i++){
            songsSecNow[i] = sc.nextInt()+songsSecNow[i-1];
        }
        int testCase2 = sc.nextInt();
        long result = 0;
        for(i=0;i<testCase2;i++){
            int questions = sc.nextInt();

            while(questions > songsSecNow[testCase1-1]){
                questions = questions - songsSecNow[testCase1-1];
            }
            for(j=0;j<testCase1;j++){
                if(questions<=songsSecNow[j]){
                    result = (result + j+1)%1000000007;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
