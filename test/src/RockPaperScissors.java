import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public void startGame() {

        Scanner sc = new Scanner(System.in);
        int play = 0;
        int win = 0;
        int draw = 0;
        int lose = 0;
        int count = 0;
        String decision;

        while (true) {

            System.out.println("게임 시작");
            System.out.println();

            System.out.println("숫자를 입력해주세요.");
            System.out.println("1. 가위");
            System.out.println("2. 바위");
            System.out.println("3. 보");

            int user = sc.nextInt();
            System.out.println();

            String userPick = "";
            switch (user) {
                case 1:
                    userPick = "가위";
                    break;

                case 2:
                    userPick = "바위";
                    break;

                case 3:
                    userPick = "보";
                    break;
            }

            System.out.println("당신은 " + "\"" + userPick + "\"" + "를 냈습니다.");

            Random rd = new Random();
            int computer = rd.nextInt(3) + 1;

            String computerPick = "";
            switch (computer) {
                case 1:
                    computerPick = "가위";
                    break;

                case 2:
                    computerPick = "바위";
                    break;

                case 3:
                    computerPick = "보";
                    break;
            }

            System.out.println("컴퓨터는 " + "\"" + computerPick + "\"" + "를 냈습니다.");
            System.out.println();

            if (user == computer) {
                System.out.println("비겼습니다.");
                draw++;
            } else if ((user == 1 && computer == 2) || (user == 2 && computer == 3) || (user == 3 && computer == 1)) {
                System.out.println("졌습니다.");
                lose++;
            } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
                System.out.println("이겼습니다.");
                win++;
            }
            System.out.println();

            play++;
            count++;

            if (count == 5) {
                System.out.println("계속 하시겠습니까? (y/n)");
                decision = sc.next();

                if (decision.equals("y") || decision.equals("Y")) {
                    count = 0;
                } else if (decision.equals("n") || decision.equals("N")) {
                    break;
                }
            }
        }

        System.out.println("게임 결과: " + play + "전 " + win + "승 " + draw + "무 " + lose + "패");
    }

}
