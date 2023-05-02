package graph;

import java.util.*;

public class AdjacencyList {
    /*그래프가 주어질 때, 이를 인접 리스트(Adjacency list)로 표현해보자.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ArrayList<Integer>> list = new ArrayList<>();
        int dot = sc.nextInt();
        int road = sc.nextInt();
        for(int i=0;i<dot;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<road;i++){
            int dotA = sc.nextInt();
            int dotB = sc.nextInt();
            list.get(dotA-1).add(dotB);
            list.get(dotB-1).add(dotA);
        }
        for(int i=0;i<dot;i++){
            Collections.sort(list.get(i));
        }


        for(ArrayList<Integer> ele : list){
            if(ele.isEmpty()){
                System.out.println(-1);
                continue;
            }
            for(Integer ele2 : ele){
                System.out.print(ele2 +" ");
            }
            System.out.println("");
        }
    }
}
