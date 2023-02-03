import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int left=1, right = 1;
        int max;
        int i;
        int[] buildings = new int[testCase];
        for(i=0;i<testCase;i++){
            buildings[i] = sc.nextInt();
        }
        max = buildings[0];
        for(i=0;i<testCase-1;i++){
            if(max < buildings[i+1]){
                max = buildings[i+1];
                left++;
            }
        }
        max = buildings[testCase-1];
        for(i=testCase-1;i>0;i--){
            if(max < buildings[i-1]){
                max = buildings[i-1];
                right++;
            }
        }
        System.out.println(left + " " + right);
    }
}
