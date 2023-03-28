package codingtest;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bread = sc.nextInt();
        int meat = sc.nextInt();
        if(bread >= meat*2){
            System.out.println(meat);
        }
        else{
            System.out.println(bread/2);
        }

    }
}
