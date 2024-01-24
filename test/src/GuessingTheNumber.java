import java.util.Random;
import java.util.Scanner;

public class GuessingTheNumber {

    public void startGame() {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int number = rd.nextInt(100) + 1;

        int count = 0;
        int answer;

        System.out.println("게임 시작");

        while (true) {

            System.out.println("1 ~ 100 사이의 수를 입력해주세요.");

            answer = sc.nextInt();

            if (answer > number) {
                System.out.println(answer + "보다 더 작습니다.");
            } else if (answer < number) {
                System.out.println(answer + "보다 더 큽니다.");
            }

            count++;

            System.out.println();

            if (number == answer) {
                System.out.println(answer + " 정답입니다!");
                break;
            }
        }

        System.out.println("총 " + count + "회 걸렸습니다.");

    }

}
