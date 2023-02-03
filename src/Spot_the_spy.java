import java.util.Scanner;

public class Spot_the_spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] spy = new int[testCase];
        int i,j;
        for(i=0;i<testCase;i++){
            int numbersRange = sc.nextInt();
            int[] numbers = new int[numbersRange];
            for(j=0;j<numbersRange;j++){
                numbers[j] = sc.nextInt();
            }
            for(j=0;j<numbersRange;j++){
                if(numbers[j] != numbers[j+1]){
                    if(j==0){
                        if(numbers[j+1] == numbers[j+2]){
                            spy[i] = j;
                            break;
                        }
                        else{
                            spy[i] = j+1;
                            break;
                        }
                    }
                    else{
                        if(numbers[j] == numbers[j-1]){
                            spy[i] = j+1;
                            break;
                        }
                        else{
                            spy[i] = j;
                            break;
                        }
                    }
                }
            }
        }
        for(i=0;i<testCase;i++){
            System.out.println(spy[i]+1);
        }

    }
}
