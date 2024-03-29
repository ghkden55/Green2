import InfiniteArray.InfiniteIntArray;
import InfiniteArray.InfiniteStringArray;

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
        iia.printArray();
        iia.remove(3);
        iia.add(5);
        iia.add(6);
        iia.replace(2,10);
        iia.printArray();
        iia.replace(7,10);
        iia.printArray();


        // 무한 문자열 배열
//        InfiniteStringArray isa = new InfiniteStringArray();
//        isa.add("가나");
//        isa.add("다라");
//        isa.add("마바");
//        isa.add("사아");
//        isa.add("자차");
//        isa.add("카타");
//        isa.add("파하");
//        isa.printArray();


        // 학생 객체 생성마다 학생 번호가 자동으로 증가
//        Student s1 = new Student("짱구");
//        Student s2 = new Student("철수");
//        Student s3 = new Student("훈이");
//        Student s4 = new Student("맹구");
//        s2.printStudentInfo();
//        s1.printStudentInfo();
//        s4.printStudentInfo();
//        s3.printStudentInfo();

    }
}
