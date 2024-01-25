import InfiniteArray.InfiniteIntArray;

public class Main {
    public static void main(String[] args) {

        // 로또 번호 생성
//        Lotto lotto = new Lotto();
//        lotto.printLotto(lotto.getLottoNum());


        // 가위바위보 게임
//        RockPaperScissors rps = new RockPaperScissors();
//        rps.startGame();


        // 숫자 맞추기
//        GuessingTheNumber gtn = new GuessingTheNumber();
//        gtn.startGame();


        // 무한 정수 배열
        InfiniteIntArray iia = new InfiniteIntArray();
        iia.add(1);
        iia.add(2);
        iia.add(3);
        iia.add(4);
        iia.add(5);
        iia.printArray();

    }
}
