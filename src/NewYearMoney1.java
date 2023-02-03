import java.util.Arrays;
import java.util.Scanner;

public class NewYearMoney1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int person = sc.nextInt();
        int[] money = new int[person];
        int[][] result = new int[person][2];
        int i,j;
        for(i=0;i<person;i++){
            Arrays.fill(result[person],0);
        }
        for(i=0;i<person;i++){
            money[i] = sc.nextInt();
        }
        for(i=0;i<person;i++){
            for(j=0;j<person;j++){
                if(i==j)continue;
                if(money[i] > money[j]){
                    result[i][0]++;
                }
                else{
                    result[i][1]++;
                }
            }
        }
        for(i=0;i<person;i++){
            System.out.println(result[i][0] + " " + result[i][1]);
        }

    }
}
