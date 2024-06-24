import java.util.Scanner;

public class Recursion3 {
    static String[] scripts1 = new String[]{
            "\"재귀함수가 뭔가요?\"",
            "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.",
            "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.",
            "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""
    };
    static String[] scripts2 = new String[]{
            "\"재귀함수가 뭔가요?\"",
            "\"재귀함수는 자기 자신을 호출하는 함수라네\"",
            "라고 답변하였지."
    };
    static int time;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        time = sc.nextInt();
        repeat(0);
    }

    public static void repeat(int dep) {
        if(dep == 0) {
            System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        }
        //기저조건 : time만큼 반복되면 종료
        if (dep == time) {
            for(int i = 0; i < scripts2.length; i++) {
                //____출력
                for(int j = 0; j < dep; j++){
                    System.out.print("____");
                }
                System.out.println(scripts2[i]);
            }
            return;
        }
        //script 출력
        for(int i = 0; i < 4; i++){
            //____출력
            for(int j = 0; j < dep; j++){
                System.out.print("____");
            }
            System.out.println(scripts1[i]);
        }
        repeat(dep+1);
        //라고 답변하였지 출력
        for(int j = 0; j < dep; j++){
            System.out.print("____");
        }
        System.out.println("라고 답변하였지.");

    }
}