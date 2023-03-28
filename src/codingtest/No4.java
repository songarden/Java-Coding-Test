package codingtest;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int member = sc.nextInt();
        int him = sc.nextInt();
        int selected = sc.nextInt();
        int[] point = new int[member];
        for(int i=0;i<member;i++){
            point[i] = sc.nextInt();
        }
        int j=0;
        while(true){
            if(point[selected-1] == 0){
                System.out.println("NO");
                System.out.println(j++);
                break;
            }
            else if(point[selected-1] == him){
                System.out.println("YES");
                break;
            }
            else{
                int next = point[selected-1];
                point[selected-1] = 0;
                selected = next;
            }

        }

    }
}
