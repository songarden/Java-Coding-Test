package CNUACA230315;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n/2;i++){
            System.out.print("수박");
        }
        if(n%2 == 1){
            System.out.println("수");
        }
    }
}
