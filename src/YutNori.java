import java.util.Scanner;

public class YutNori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        String yutRoll = sc.nextLine();
        for(int i=0;i<4;i++){
            if(yutRoll.charAt(i) == '1'){
                result++;
            } //1은 앞면 0은 뒷면으로 윳 입력받은걸 확인
        }
        if(result == 0){
            result = 5; //다 0일경우 모로 판정 5칸 이동
        }
        System.out.println(result);
    }
}
