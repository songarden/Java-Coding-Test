package CNUACA230209;

import java.util.Scanner;

public class Lipogram {
    //리포그램(lipogram)은 팬그램(pangram)과 반대되는 개념으로,
    //알파벳의 일부 글자를 사용하지 않고 만든 문장이다.
    //주어진 문자열이 리포그램인지 확인해보자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphaBig = new int[26];
        int[] alphaSmall = new int[26];
        String pangramStr = sc.nextLine().replace(" ","");
        for(int i=0;i< pangramStr.length();i++) {
            if (pangramStr.charAt(i) >= 97) {
                ++alphaSmall[pangramStr.charAt(i) - 97];
            } else {
                ++alphaBig[pangramStr.charAt(i) - 65];
            }
        }
        String result = "NO";
        for(int i=0;i<26;i++){
            if(alphaSmall[i] == 0 && alphaBig[i] == 0){
                result = "YES";
            }
        }
        System.out.println(result);
        for(int i=0;i<alphaBig.length;i++){
            if(alphaSmall[i] == 0 && alphaBig[i] == 0){
                System.out.print((char)(i+'a'));
            }
        }
    }
}
