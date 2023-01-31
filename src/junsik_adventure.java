import java.util.Scanner;

public class junsik_adventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        System.out.println(testCase);
        int[][] testresult = new int[testCase][2];
        int i,j,k;
        int row,column;
        for(i=0;i<testCase;i++){
            int startRow=0,startCol=0;
            column = sc.nextInt();
            row = sc.nextInt();
            System.out.println(row + " "+ column);
            char [][] world2d = new char [column][row];
            for(j=0;j<column;j++){
                String oneLine = sc.next();
                for(k=0;k<row;k++){
                    world2d[j][k] = oneLine.charAt(k);
                    System.out.println(world2d[j][k]);
                    if(world2d[j][k] == '@'){
                        startRow = k;
                        startCol = j;
                        System.out.println("i found" + k +" "+ j);
                    }
                }
            }
            int moveNum = sc.nextInt();
            System.out.println(moveNum);
            String move = sc.next();
            System.out.println(move);
            for(j=0;j<moveNum;j++){
                if(move.charAt(j) == 'L') {
                    if (startRow == 0) {
                        System.out.println("리스트 끝이야");
                        continue;
                    } else if (world2d[startCol][startRow - 1] == '#') {
                        System.out.println("There is wall");
                        continue;
                    } else {
                        startRow--;
                        System.out.println("move L");
                    }
                }
                else if(move.charAt(j) == 'R') {
                    if (startRow == row - 1) {
                        System.out.println("리스트 끝이야");
                        continue;
                    } else if (world2d[startCol][startRow + 1] == '#') {
                        System.out.println("There is wall");
                        continue;
                    } else {
                        System.out.println("move R");
                        startRow++;
                    }
                }
                else if(move.charAt(j) == 'U') {
                    if (startCol == 0) {
                        System.out.println("리스트 끝이야");
                        continue;
                    } else if (world2d[startCol - 1][startRow] == '#') {
                        System.out.println("There is wall");
                        continue;
                    } else {
                        System.out.println("move U");
                        startCol--;
                    }
                }
                else if(move.charAt(j) == 'D'){
                    if(startCol == column-1){
                        System.out.println("리스트 끝이야");
                        continue;
                    }
                    else if(world2d[startCol+1][startRow] == '#'){
                        System.out.println("There is wall");
                        continue;
                    }
                    else{
                        System.out.println("move U");
                        startCol++;
                    }
                }
            }
            testresult[i][0] = startCol + 1;
            testresult[i][1] = startRow + 1;
        }
        for(i=0;i<testCase;i++){
            System.out.println(testresult[i][0]+ " " + testresult[i][1]);
        }
    }
}
