package codingtest;

import java.util.*;

public class No5 //실패{
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] time;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        // 그래프 생성
        graph = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        // 그래프 정보 입력
        for (int i = 1; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        // BFS 탐색을 위한 변수 초기화
        visited = new boolean[N+1];
        time = new int[N+1];

        // 임의의 정점에서 시작하여 가장 먼 정점 찾기
        int maxDistNode = bfs(1);
        // 가장 먼 정점에서 시작하여 다시 가장 먼 정점 찾기
        int answer = bfs(maxDistNode);

        System.out.println(answer);
    }

    // BFS 탐색으로 트리의 지름 찾기
    static int bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        int maxDist = 0;
        int maxDistNode = start;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int next : graph[node]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                    time[next] = time[node] + 1;
                    if (time[next] > maxDist) {
                        maxDist = time[next];
                        maxDistNode = next;
                    }
                }
            }
        }

        // BFS 탐색 후 초기화
        visited = new boolean[N+1];
        time = new int[N+1];

        return maxDistNode;
    }
}

