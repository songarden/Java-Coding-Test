import java.util.Arrays;
import java.util.Scanner;

public class Snow1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int i,j;
        int row1=0,col1=0,row2=0,col2=0;
        int temp;
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        row2 = sc.nextInt();
        col2 = sc.nextInt();
        if(row1 >row2){
            temp = row1;
            row1 = row2;
            row2 = temp;
        }
        if(col1 > col2){
            temp = col1;
            col1 = col2;
            col2 = temp;
        }

        char[][] snow = new char[length][length];
        for(i=0;i<length;i++){
            for(j=0;j<length;j++){
                if(j>=col1-1 && j<= col2-1 && i>=row1 -1 && i <= row2-1){
                    snow[i][j] = '.';
                    System.out.print(snow[i][j]);
                    continue;
                }
                snow[i][j] = '*';
                System.out.print(snow[i][j]);
            }
            System.out.println("");
        }
    }
}
