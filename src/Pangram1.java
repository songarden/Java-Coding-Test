import java.util.Scanner;

public class Pangram1 {
    //팬그램(pangram)은 알파벳의 모든 글자를 사용해 만든 문장이다.
    // 주어진 문자열이 팬그램인지 확인해보자.
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
        String result = "YES";
        for(int i=0;i<26;i++){
            if(alphaSmall[i] == 0 && alphaBig[i] == 0){
                result = "NO";
                break;
            }
        }
        System.out.println(result);


    }
}
