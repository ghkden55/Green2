package classTest;

public class ClassTest {
    public static void main(String[] args) {

        Bus bus = new Bus(100);
        Student stu1 = new Student("홍길동", 2000);
        Student stu2 = new Student("임꺽정", 3000);

        stu1.useBus(bus);
        stu2.useBus(bus);

        stu1.printStudentInfo();
        stu2.printStudentInfo();
        bus.printBusInfo();

        stu1.getOffBus(bus);
        stu2.getOffBus(bus);

        stu1.printStudentInfo();
        stu2.printStudentInfo();
        bus.printBusInfo();

    }
}
