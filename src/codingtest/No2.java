package codingtest;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        if(count%3==1){
            System.out.println("1 2 3");
        }
        else if(count%3 ==2){
            System.out.println("2 3 1");
        }
        else{
            System.out.println("3 1 2");
        }
    }
}
