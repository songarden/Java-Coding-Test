package CNUACA230213;

import java.util.Scanner;

public class Laser {
    //2차원 좌표 평면 (x1, y1) 에 레이저 포인터가 위치해 있다.
    // 레이저 포인터는 상하좌우 방향 중 한 방향으로 레이저를 발사할 수 있고,
    // 레이저는 발사한 방향으로 영원히 뻗어나간다.
    //
    //레이저 포인터로 (x2, y2) 에 위치한 물체를 맞히려고 한다.
    // 만약 직접적으로 레이저 포인터로 맞힐 수 없다면 2차원 좌표 평면에 아무 곳에나 대각선으로 비스듬히 거울을 설치할 수 있다.
    // 레이저는 거울에 부딪힌 후에 진행 방향이 바뀐다.
    //
    // 예를 들어 위 그림과 같은 예시에서 (1, 4) 위치에 비스듬히 거울을 설치하면 레이저로 물체를 맞힐 수 있다.
    //
    //레이저로 물체를 맞히기 위해 필요한 최소의 거울 개수는 얼마일까?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1=0,a2=0,b1=0,b2=0;
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        b1 = sc.nextInt();
        b2 = sc.nextInt();
        int result;
        if(a1 == b1 || a2 == b2){
            result = 0;
        }
        else{
            result = 1;
        }
        System.out.println(result);
    }
}
