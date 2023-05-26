package utecamp;

import java.util.Arrays;
import java.util.Scanner;

public class BoxAndMoney {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int box = sc.nextInt();
            Long money = sc.nextLong();
            int day = sc.nextInt();

            int[] multMoney = new int[box];

            for(int i=0;i<multMoney.length;i++){
                multMoney[i] = sc.nextInt();
            }
            Arrays.sort(multMoney);

            for(int i=0;i<day;i++){
                Long perTenThousand = money/10000;
                for(int j=multMoney.length-1;j>=0;j--){
                    if(perTenThousand*multMoney[j] > 100000){
                        continue;
                    }
                    money += perTenThousand*multMoney[j];
                    break;
                }
            }

            System.out.println(money);
    }
}
