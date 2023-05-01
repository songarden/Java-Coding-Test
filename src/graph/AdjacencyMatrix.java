package graph;

import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dot = sc.nextInt();
        int road = sc.nextInt();

        int[][] matrix = new int[dot][dot];
        for(int i=0;i<road;i++){
            int dotA = sc.nextInt() - 1;
            int dotB = sc.nextInt() - 1;
            matrix[dotA][dotB] = 1;
            matrix[dotB][dotA] = 1;
        }
        for(int[] element : matrix){
            for(int ele : element){
                System.out.print(ele + " ");
            }
            System.out.println("");
        }
    }
}
