package Febrary_Coding_Test;

import java.util.Scanner;

public class Febtest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fst = sc.nextInt();
        int sec = sc.nextInt();
        int move;
        int least;
        int tmp;
        if(fst>sec){
            tmp = fst;
            fst = sec;
            sec = tmp;
        }
        move = (fst+sec)/2 - fst;
        if((fst+sec)%2 == 0){
            least = 0;
        }
        else{
            least = 1;
        }
        System.out.println(least+" "+move);
    }


}
