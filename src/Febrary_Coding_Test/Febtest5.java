package Febrary_Coding_Test;

import java.util.Scanner;

public class Febtest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().replace(" ","");
        int testCase = sc.nextInt();
        int[] result = new int[testCase];
        for(int i=0;i<testCase;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] alphaBig = new int[26];
            int[] alphaSmall = new int[26];
            for(int j=a-1;j<b;j++){
                if(word.charAt(j) >= 97){
                    ++alphaSmall[word.charAt(j) - 97];
                }
                else{
                    ++alphaBig[word.charAt(j) - 65];
                }
            }
            result[i] = 1;
            for(int j=0;j<26;j++){
                if(alphaSmall[j] == 0 && alphaBig[j] == 0 ){
                    result[i] = 0;
                    break;
                }
            }
        }
        for(int i=0;i<testCase;i++){
            System.out.print(result[i]);
        }
    }
}
