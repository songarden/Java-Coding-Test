package queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Stone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> que = new LinkedList<>();
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            que.offer(i);
        }

        int act = sc.nextInt();
        for(int i=0;i<act;i++){
            String action = sc.next();
            if(que.size() == 1){
                break;
            }
            if(action.equals("raise")){
                int raise = que.poll();
                que.offer(raise);
            }
            else if(action.equals("discard")){
                que.poll();
            }
        }

        int answer = que.poll();
        System.out.println(answer);
    }
}
