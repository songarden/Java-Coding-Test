package CNUACA230213;

import java.util.Scanner;

public class Flatten {
    //정수 A[1], A[2], ... , A[N] 을 평탄화하려고 한다.
    // 수열을 평탄화한다는 것은 모든 수열의 값이 동일하게 만든다는 것이다.
    // 수열의 임의의 원소 A[i] 하나를 1 만큼 감소시키는데에 1 시간이 걸릴 때,
    // 수열을 평탄화하기 위해서는 최소 몇 시간이 필요할까?
    // 원소를 감소시킬 수만 있고 증가시킬 수 없는뎅에 유의한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] num = new int[testCase];
        for(int i=0;i<testCase;i++){
            num[i] = sc.nextInt();
        }
        int min = num[0];
        for(int i=1;i<testCase;i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        int result =0;
        for(int i=0;i<testCase;i++){
            result += num[i]-min;
        }
        System.out.println(result);
    }
}
