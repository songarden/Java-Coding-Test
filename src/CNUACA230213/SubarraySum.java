package CNUACA230213;

import java.util.Scanner;

public class SubarraySum {
    //길이가 N 인 수열 A[1], A[2], ..., A[N] 이 주어질 때,
    // 수열의 L 번째 원소부터 R 번째 원소까지의 합을 구해보자.

    //입력
    //첫째 줄에 정수 N (1 ≤ N ≤ 100), M (1 ≤ M ≤ 10 000) 이 주어진다.
    //둘째 줄에 정수 A[1], A[2], ..., A[N] (-100 ≤ A[i] ≤ 100) 이 주어진다.
    //셋째 줄부터 M 개의 줄에 L, R (1 ≤ L ≤ R ≤ N) 이 주어진다.

    //출력
    //M 개의 줄에 수열의 L 번째 원소부터 R 번째 원소까지의 합을 출력한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLength = sc.nextInt();
        int testCase = sc.nextInt();
        int[] result = new int[testCase];
        int[] num = new int[numLength];
        for(int i=0;i<numLength;i++){
            num[i] = sc.nextInt();
        }
        for(int i=0;i<testCase;i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            if(L==R){
                result[i] = num[L-1];
            }
            else{
                for(int j=L-1;j<R;j++){
                    result[i] += num[j];
                }
            }
        }
        for(int i=0;i<testCase;i++){
            System.out.println(result[i]);
        }
    }
}
