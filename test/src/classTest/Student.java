package classTest;

public class Student {

    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void printStudentInfo() {
        System.out.println("학생 이름: " + name);
        System.out.println("현재 소지금: " + money);
        System.out.println();
    }

    public void useBus(Bus bus) {
        money -= bus.getCost();
        bus.takeStudent();
    }

    public void getOffBus(Bus bus) {
        bus.takeOffStudent();
    }
}
