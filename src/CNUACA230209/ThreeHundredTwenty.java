package CNUACA230209;

import java.util.Scanner;

public class ThreeHundredTwenty {
    //훈련된 초밥 장인이 한 번 초밥을 쥘 때 담는 밥알은 320개라고 알려져 있다.
    //일식집에서 아르바이트를 하는 준식이는 N 개의 초밥을 열심히 만들어 보았지만 각 초밥에 담긴 밥알의 개수가 제각각이었다.
    // 이 중에서 그나마 밥알의 개수가 320개에 가장 가까운 초밥 하나를 손님에게 내놓으려고 한다.
    // 준식이는 몇 번째 초밥을 내놓아야 할까?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int choBab = sc.nextInt();
        int bestChoBab;
        int bestChoBabNum = 1;
        if(choBab <= 320){
            bestChoBab = 320 - choBab;
        }
        else{
            bestChoBab = choBab - 320;
        }
        for(int i=2;i<testCase+1;i++){
            choBab = sc.nextInt();
            if(choBab <= 320 && bestChoBab > 320-choBab){
                bestChoBabNum = i;
                bestChoBab = 320-choBab;
            }
            else if(choBab > 320 && bestChoBab > choBab-320){
                bestChoBabNum = i;
                bestChoBab = choBab-320;
            }
        }
        System.out.println(bestChoBabNum);
    }
}
